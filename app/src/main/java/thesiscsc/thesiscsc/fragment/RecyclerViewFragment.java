package thesiscsc.thesiscsc.fragment;

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

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    static final boolean GRID_LAYOUT = false;
    private int ITEM_COUNT = 0;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private List<Task> mContentItems = new ArrayList<>();
    private Queue<Task> taskQueue;
    private List<Task> onGoingList, comingList, endedList;
    private int position;


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

        switch (position){
            case 0: loadOngoingTask(); break;
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
        mAdapter = new TestRecyclerViewAdapter(mContentItems, taskQueue);

        //mAdapter = new RecyclerViewMaterialAdapter();
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), mRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int itemPos) {
                        //TODO: Redirect to new fragment
                        switch (position){
                            case 0:
                                System.out.println(onGoingList.get(itemPos).getName() + " IS IN CATEGORY: " + position);
                                TaskInfoFragment onGoing = new TaskInfoFragment();
                                onGoing.addTaskToShow(onGoingList.get(itemPos));
                                //nextFragment(onGoing);
                                break;
                            case 1:
                                System.out.println(comingList.get(itemPos).getName() + " IS IN CATEGORY: " + position);
                                TaskInfoFragment coming = new TaskInfoFragment();
                                coming.addTaskToShow(comingList.get(itemPos));
                                //nextFragment(coming);
                                break;
                            case 2:
                                System.out.println(endedList.get(itemPos).getName() + " IS IN CATEGORY: " + position);
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

    private void loadOngoingTask(){
        onGoingList = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
        Task yo = new Task("Jeg");
        Task yo1 = new Task("Er");
        Task yo2 = new Task("Best");
        Task yo3 = new Task("Og");
        Task yo4 = new Task("Jeg");
        Task yo5 = new Task("Heter");
        Task yo6 = new Task("Thang");

        onGoingList.add(yo);
        onGoingList.add(yo1);
        onGoingList.add(yo2);
        onGoingList.add(yo3);
        onGoingList.add(yo4);
        onGoingList.add(yo5);
        onGoingList.add(yo6);
        ITEM_COUNT = onGoingList.size();

        for (int i = 0; i < ITEM_COUNT; i++) {
            mContentItems.add(onGoingList.get(i));
            if (i > 0) {
                taskQueue.add(onGoingList.get(i));
            }
        }
    }
    private void loadComingTask(){
        comingList = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
        Task yo = new Task("YO");
        Task yo1 = new Task("Er");


        comingList.add(yo);
        comingList.add(yo1);

        ITEM_COUNT = comingList.size();


        for (int i = 0; i < ITEM_COUNT; i++) {
            mContentItems.add(comingList.get(i));
            if (i > 0) {
                taskQueue.add(comingList.get(i));
            }
        }
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
        ITEM_COUNT = endedList.size();


        for (int i = 0; i < ITEM_COUNT; i++) {
            mContentItems.add(endedList.get(i));
            if (i > 0) {
                taskQueue.add(endedList.get(i));
            }
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