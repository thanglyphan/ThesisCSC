package thesiscsc.thesiscsc.fragment;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.MultiTapKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.florent37.materialviewpager.adapter.RecyclerViewMaterialAdapter;
import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import domain.ActualOwnerProperties;
import domain.AuthenticationToken;
import domain.SicsGenericInput;
import domain.SicsUserReference;
import domain.SicsWsDomainSearchEntryPointBinding;
import domain.TaskFindCriteria;
import domain.TaskProperties;
import domain.TaskSearchCriteria;
import domain.TaskSearchResultOutput;
import domain.TaskUserList;
import ips.SicsWsAdministrationEntryPointBinding;
import thesiscsc.thesiscsc.R;
import thesiscsc.thesiscsc.model.Task;
import thesiscsc.thesiscsc.other.RecyclerItemClickListener;
import thesiscsc.thesiscsc.other.TestRecyclerViewAdapter;

import static thesiscsc.thesiscsc.R.id.end;
import static thesiscsc.thesiscsc.R.id.name_txt_small;

/**
 * Created by thang on 24.01.2017.
 */
public class RecyclerViewFragment extends Fragment {
    private final String SERVER_ADDRESS = "88.89.218.114:8325";
    static final boolean GRID_LAYOUT = false;
    private int ITEM_COUNT = 0;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private List<Task> mContentItems = new ArrayList<>();
    private Queue<Task> taskQueue;
    private List<Task> onGoingList, comingList, endedList;
    private int position;

    SicsWsAdministrationEntryPointBinding adminService = new SicsWsAdministrationEntryPointBinding(null, "http://"+ SERVER_ADDRESS + "/SwanLake/SicsWSServlet");
    Boolean status = false;
    ArrayList<String> taskNames = new ArrayList<String>();

    public void addPosition(int position){
        this.position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recyclerview, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager;
        taskQueue = new ArrayDeque<>();
        switch (position){
            case 0: new CallTaskGetService().execute(); System.out.println("YO"); break;
            case 1: loadComingTask(); break;
            case 2: loadEndedTask(); break;
        }

        if (GRID_LAYOUT) {
            layoutManager = new GridLayoutManager(getActivity(), 2);
        } else {
            layoutManager = new LinearLayoutManager(getActivity());
        }

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

        //Use this now
        mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
        //mAdapter = new TestRecyclerViewAdapter(mContentItems, taskQueue);
        //mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), mRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int itemPos) {
                        //TODO: Redirect to new fragment
                        switch (position){
                            case 0:
                                TaskInfoFragment onGoing = new TaskInfoFragment();
                                onGoing.addTaskToShow(onGoingList.get(itemPos));
                                //nextFragment(onGoing);
                                break;
                            case 1:
                                TaskInfoFragment coming = new TaskInfoFragment();
                                coming.addTaskToShow(comingList.get(itemPos));
                                //nextFragment(coming);
                                break;
                            case 2:
                                TaskInfoFragment ended = new TaskInfoFragment();
                                ended.addTaskToShow(endedList.get(itemPos));
                                //nextFragment(ended);
                                break;
                        }
                    }

                    @Override public void onLongItemClick(View view, int itemPos) {
                        switch (position){
                            case 0: System.out.println(onGoingList.get(itemPos).getName() + " IS IN CATEGORY: " + position); break;
                            case 1: System.out.println(comingList.get(itemPos).getName() + " IS IN CATEGORY: " + position); break;
                            case 2: System.out.println(endedList.get(itemPos).getName() + " IS IN CATEGORY: " + position); break;
                        }
                    }
                })
        );
    }

    private void loadOngoingTask(ArrayList<Task> a){
        onGoingList = a;//new ArrayList<>();
        addToSection((ArrayList<Task>) onGoingList);
    }
    private void loadComingTask(){
        comingList = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
        Task yo = new Task("YO");
        Task yo1 = new Task("Er");


        comingList.add(yo);
        comingList.add(yo1);

        addToSection((ArrayList<Task>) comingList);
    }
    private void loadEndedTask(){
        endedList = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
        Task yo = new Task("LOL");
        Task yo1 = new Task("Er");
        Task yo2 = new Task("LOL");
        Task yo3 = new Task("Og");
        Task yo4 = new Task("LOL");
        Task yo5 = new Task("Heter");
        Task yo6 = new Task("LOL");

        endedList.add(yo);
        endedList.add(yo1);
        endedList.add(yo2);
        endedList.add(yo3);
        endedList.add(yo4);
        endedList.add(yo5);
        endedList.add(yo6);

        addToSection((ArrayList<Task>) endedList);
    }

    class CallTaskGetService extends AsyncTask<String, Void, String> {
        String taskFindCriteriaInt = "";

        @Override
        protected void onPostExecute(String s) {
            System.out.println(taskNames.size());
            List<Task> list = new ArrayList<>();
            int size = taskNames.size();
            if(size > 0) {
                for(int i = 0; i < size; i++) {
                    list.add(new Task(taskNames.get(i)));
                }
            } else {
                list.add(new Task("No task found for: "));
            }
            loadOngoingTask((ArrayList<Task>) list);
        }

        @Override
        protected String doInBackground(String... params) {
            SicsGenericInput param0 = new SicsGenericInput();

            param0.sicsServerBaseVersion = "[Environment:P&amp;amp;C][Version:4.6.1][Build:461vm][XmlCompatibilityType:JAXWS]";
            AuthenticationToken token = new AuthenticationToken();
            token.userId = "SICSPC"; //TODO: INSERT REAL ID.
            param0.authenticationToken = token;

            TaskSearchCriteria param1 = new TaskSearchCriteria();

            TaskProperties taskProp = new TaskProperties();
            taskProp.findOnlyOwnTasks = false;

            TaskFindCriteria taskcrit = new TaskFindCriteria();

            taskcrit.taskProperties = taskProp;


            SicsUserReference katt = new SicsUserReference();
            katt.userId = "SICSPC";
            TaskUserList users = new TaskUserList();
            users.add(katt);
            ActualOwnerProperties actOwner = new ActualOwnerProperties();
            actOwner.actualOwnerList = users;
            taskcrit.actualOwnerProperties = actOwner;
            param1.criteria = taskcrit;
            SicsWsDomainSearchEntryPointBinding service = new SicsWsDomainSearchEntryPointBinding(null,"http://"+ SERVER_ADDRESS + "/SwanLake/SicsWSServlet");
            String result = "";

            try{
                TaskSearchResultOutput res = service.executeTaskSearch(param0,param1);

                domain.TaskFindResult en = res.taskSearchResultList.get(0);
                domain.TaskFindResult to = res.taskSearchResultList.get(1);
                domain.TaskFindResult tre = res.taskSearchResultList.get(2);
                domain.TaskFindResult fire = res.taskSearchResultList.get(3);
                domain.TaskFindResult fem = res.taskSearchResultList.get(4);

                taskNames.add(en.nlsName);
                taskNames.add(to.nlsName);
                taskNames.add(tre.nlsName);
                taskNames.add(fire.nlsName);
                taskNames.add(fem.nlsName);

            }catch (Exception e){

            }

            try {
                result = adminService.about().getProperty(0).toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }
    }

    private void addToSection(ArrayList<Task> list){
        ITEM_COUNT = list.size();
        this.taskQueue = new ArrayDeque<>();
        {
            for (int i = 0; i < ITEM_COUNT; i++) {
                mContentItems.add(list.get(i));
                System.out.println(list.get(i).getName());
                if (i > 0) {
                    taskQueue.add(list.get(i));
                }
            }
            mAdapter = new TestRecyclerViewAdapter(mContentItems, taskQueue);
            mRecyclerView.setAdapter(mAdapter);
            mAdapter.notifyDataSetChanged();
        }
    }

    private void nextFragment(TaskInfoFragment a){
        System.out.println("INSIDE NEXT FRAGMENT");
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        System.out.println("TRANSACTION BEGIN");
        ft.replace(mRecyclerView.getId(), a);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        System.out.println("VIEW REPLACED");

        ft.addToBackStack(null);
        System.out.println("STACK NULL");
        ft.commit();
    }

}