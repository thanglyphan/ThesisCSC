package thesiscsc.thesiscsc.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
import thesiscsc.thesiscsc.other.TestRecyclerViewAdapter;

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
    }

    private void loadOngoingTask(){
        List<Task> taskList = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
        Task yo = new Task("Jeg");
        Task yo1 = new Task("Er");
        Task yo2 = new Task("Best");
        Task yo3 = new Task("Og");
        Task yo4 = new Task("Jeg");
        Task yo5 = new Task("Heter");
        Task yo6 = new Task("Thang");

        taskList.add(yo);
        taskList.add(yo1);
        taskList.add(yo2);
        taskList.add(yo3);
        taskList.add(yo4);
        taskList.add(yo5);
        taskList.add(yo6);
        ITEM_COUNT = taskList.size();


        for (int i = 0; i < ITEM_COUNT; i++) {
            mContentItems.add(taskList.get(i));
            if (i > 0) {
                taskQueue.add(taskList.get(i));
            }
        }
    }
    private void loadComingTask(){
        List<Task> taskList = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
        Task yo = new Task("YO");
        Task yo1 = new Task("Er");


        taskList.add(yo);
        taskList.add(yo1);

        ITEM_COUNT = taskList.size();


        for (int i = 0; i < ITEM_COUNT; i++) {
            mContentItems.add(taskList.get(i));
            if (i > 0) {
                taskQueue.add(taskList.get(i));
            }
        }
    }
    private void loadEndedTask(){
        List<Task> taskList = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
        Task yo = new Task("LOL");
        Task yo1 = new Task("Er");
        Task yo2 = new Task("LOL");
        Task yo3 = new Task("Og");
        Task yo4 = new Task("LOL");
        Task yo5 = new Task("Heter");
        Task yo6 = new Task("LOL");

        taskList.add(yo);
        taskList.add(yo1);
        taskList.add(yo2);
        taskList.add(yo3);
        taskList.add(yo4);
        taskList.add(yo5);
        taskList.add(yo6);
        ITEM_COUNT = taskList.size();


        for (int i = 0; i < ITEM_COUNT; i++) {
            mContentItems.add(taskList.get(i));
            if (i > 0) {
                taskQueue.add(taskList.get(i));
            }
        }
    }
}