package thesiscsc.thesiscsc.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.annotation.BoolRes;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Queue;

import SicsWsDomainSearchEntryPoint.ActualOwnerProperties;
import SicsWsDomainSearchEntryPoint.AuthenticationToken;
import SicsWsDomainSearchEntryPoint.SicsGenericInput;
import SicsWsDomainSearchEntryPoint.SicsUserReference;
import SicsWsDomainSearchEntryPoint.SicsWsDomainSearchEntryPointBinding;
import SicsWsDomainSearchEntryPoint.TaskFindCriteria;
import SicsWsDomainSearchEntryPoint.TaskFindResult;
import SicsWsDomainSearchEntryPoint.TaskProperties;
import SicsWsDomainSearchEntryPoint.TaskSearchCriteria;
import SicsWsDomainSearchEntryPoint.TaskSearchResultOutput;
import SicsWsDomainSearchEntryPoint.TaskUserList;
import SicsWsAdministrationEntryPoint.SicsWsAdministrationEntryPointBinding;
import thesiscsc.thesiscsc.PaymentActivity;
import thesiscsc.thesiscsc.R;
import thesiscsc.thesiscsc.model.Task;
import thesiscsc.thesiscsc.other.CallIsAvailable;
import thesiscsc.thesiscsc.other.RecyclerItemClickListener;
import thesiscsc.thesiscsc.other.TestRecyclerViewAdapter;

/**
 * Created by thang on 24.01.2017.
 */
public class RecyclerViewFragment extends Fragment {
    static final boolean GRID_LAYOUT = false;
    private int ITEM_COUNT = 0;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private List<Task> mContentItems = new ArrayList<>();
    private Queue<Task> taskQueue;
    private List<Task> inprogressList, reservedList, paymentList, allTaskList;
    private int position;

    private String SERVER_ADDRESS; //http://192.168.43.115:8325
    private String username;
    private String loginToken;
    private Date exp_token;
    SharedPreferences prefs;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private final String INPROGRESS = "INPROGRESS";
    private final String RESERVED = "RESERVED";
    private final String COMPLETED = "COMPLETED";
    private final String ALL = "ALL";



    ArrayList<TaskFindResult> taskList = new ArrayList<>();
    ArrayList<Task> hardcodedList;

    public void addPosition(int position){
        this.position = position;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {
            String reply = new CallIsAvailable().CallIsAvailable(getContext());
            return inflater.inflate(R.layout.fragment_recyclerview, container, false);
        } catch (Exception e) {
            Log.d("ÆØÅ",Log.getStackTraceString(e));
        }
        return null;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        prefs = getActivity().getSharedPreferences("credentials", Context.MODE_PRIVATE);
        username = prefs.getString("username", "");
        loginToken = prefs.getString("signature","");
        exp_token = new Date(prefs.getLong("exp", 0));

        SERVER_ADDRESS = prefs.getString("ip","");


        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager;
        taskQueue = new ArrayDeque<>();

        hardcodedList = new ArrayList<>();
        hardcodedList.add(new Task("KOMMENDE OG AVSLUTTET", 0));
        hardcodedList.add(new Task("Jeg er 1", 1));
        hardcodedList.add(new Task("Jeg er 2", 2));
        hardcodedList.add(new Task("Jeg er 3", 3));
        hardcodedList.add(new Task("Jeg er 4", 4));
        hardcodedList.add(new Task("Jeg er 5", 5));
        hardcodedList.add(new Task("Jeg er 6", 6));
        hardcodedList.add(new Task("Jeg er 7", 7));


        switch (position){
            case 0: new CallTaskGetService().execute(ALL); break;
            case 1: new CallTaskGetService().execute(INPROGRESS); break;
            case 2: new CallTaskGetService().execute(RESERVED); break;
            case 3: new CallTaskGetService().execute(COMPLETED); break;
        }

        //new CallTaskGetService().execute();

        if (GRID_LAYOUT) {
            layoutManager = new GridLayoutManager(getActivity(), 2);
        } else {
            layoutManager = new LinearLayoutManager(getActivity());
        }

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

        //Use this now
        mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
        mAdapter = new TestRecyclerViewAdapter(mContentItems, taskQueue, this.getContext());
        mRecyclerView.setAdapter(mAdapter);

        loadRefresher(view);
    }

    private void loadAllTask(ArrayList<Task> a) {
        allTaskList = a;
        addToSection((ArrayList<Task>) allTaskList);
    }
    private void loadReservedTask(ArrayList<Task> a){
        reservedList = a;
        addToSection((ArrayList<Task>) reservedList);
    }
    private void loadInprogressTask(ArrayList<Task> a){
        inprogressList = a;
        addToSection((ArrayList<Task>) inprogressList);
    }
    private void loadEndedTask(ArrayList<Task> a){
        paymentList = a;
        addToSection((ArrayList<Task>) paymentList);
    }

    class CallTaskGetService extends AsyncTask<String, Void, String> {
        ArrayList<Task> listInprogress;
        ArrayList<Task> listReserved;
        ArrayList<Task> listPayment;
        ArrayList<Task> allTask;

        @Override
        protected void onPreExecute(){
            taskList = new ArrayList<>();
            listInprogress = new ArrayList<>();
            listReserved = new ArrayList<>();
            listPayment = new ArrayList<>();
            allTask = new ArrayList<>();

        }

        @Override
        protected void onPostExecute(String result) {
            List<Task> list = new ArrayList<>();

            int size = taskList.size();
            if(size > 0) {
                for(int i = 0; i < size; i++) {
                    //list.add(new Task(taskList.get(i), i));
                    //System.out.println("STATUS------   " + list.get(i).getStatus());
                    Task task = new Task(taskList.get(i), i);
                    allTask.add(task);

                    if(task.nlsName.equals("Authorize and Close Remittance")||task.nlsName.equals("Update Remittance")) {
                            listPayment.add(task);

                    } else {
                        switch (task.getStatus()){
                            case "RESERVED": listReserved.add(task); break;
                            case "INPROGRESS": listInprogress.add(task); break;
                            default: break;
                        }
                    }

                }
            } else {
                list.add(new Task("No task found for: " + username, 0));
            }
            loadAllTask(allTask);
            switch (result){
                case INPROGRESS: loadInprogressTask(listInprogress); break;
                case RESERVED: loadReservedTask(listReserved); break;
                case COMPLETED: loadEndedTask(listPayment); break;
                default: break;
            }

            mSwipeRefreshLayout.setRefreshing(false);
        }

        @Override
        protected String doInBackground(String... params) {
            SicsGenericInput param0 = new SicsGenericInput();
            AuthenticationToken token = new AuthenticationToken();
            token.userId = username;
            token.signature = loginToken;
            token.expiration = exp_token;
            param0.authenticationToken = token;

            TaskSearchCriteria param1 = new TaskSearchCriteria();
            TaskProperties taskProp = new TaskProperties();
            taskProp.findOnlyOwnTasks = true;

            TaskFindCriteria taskcrit = new TaskFindCriteria();
            taskcrit.taskProperties = taskProp;

            SicsUserReference sicReference = new SicsUserReference();
            sicReference.userId = username;
            TaskUserList users = new TaskUserList();
            users.add(sicReference);

            ActualOwnerProperties actOwner = new ActualOwnerProperties();
            actOwner.actualOwnerList = users;
            taskcrit.actualOwnerProperties = actOwner;

            param1.criteria = taskcrit;

            SicsWsDomainSearchEntryPointBinding service = new SicsWsDomainSearchEntryPointBinding(null,"http://"+ SERVER_ADDRESS + "/SwanLake/SicsWSServlet");
            String result = params[0];

            try{
                TaskSearchResultOutput res = service.executeTaskSearch(param0,param1);

                for(SicsWsDomainSearchEntryPoint.TaskFindResult a: res.taskSearchResultList) {
                    if(!taskList.contains(a)) {
                        taskList.add(a);
                    }
                }

            }catch (Exception e){
                Log.d("nothing", loginToken);
            }

            return result;
        }
    }

    private void addToSection(ArrayList<Task> list){

        ITEM_COUNT = list.size();
        this.taskQueue = new ArrayDeque<>();
        this.mContentItems = new ArrayList<>();
        {
            for (int i = 0; i < ITEM_COUNT; i++) {
                mContentItems.add(list.get(i));
                if (i > 0) {
                    taskQueue.add(list.get(i));
                }
            }

            mAdapter = new TestRecyclerViewAdapter(mContentItems, taskQueue, this.getContext());
            mRecyclerView.setAdapter(mAdapter);
            mAdapter.notifyDataSetChanged();
        }
    }

    private void loadRefresher(View v){
        mSwipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.swiperefresh);
        mSwipeRefreshLayout.setProgressViewOffset(false, 210, 350);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.CornflowerBlue);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh() {
                refreshList(position);
            }
        });
    }
    private void refreshList(int position) {
        switch (position) {
            case 0: new CallTaskGetService().execute(ALL); break;
            case 1: new CallTaskGetService().execute(INPROGRESS); break;
            case 2: new CallTaskGetService().execute(RESERVED); break;
            case 3: new CallTaskGetService().execute(COMPLETED); break;
            default: mSwipeRefreshLayout.setRefreshing(false);

        }
    }

    public void addUsername(String username, String token, Date exp_date){
        this.username = username;
        this.loginToken = token;
        this.exp_token = exp_date;
    }
}