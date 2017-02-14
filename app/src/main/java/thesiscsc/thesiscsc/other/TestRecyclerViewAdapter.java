package thesiscsc.thesiscsc.other;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import domain.In;
import thesiscsc.thesiscsc.R;
import thesiscsc.thesiscsc.fragment.RecyclerViewFragment;
import thesiscsc.thesiscsc.model.Task;


/**
 * Created by thang on 24.01.2017.
 */

public class TestRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Task> contents;
    Queue<Task> taskQueue;
    private RecyclerView mRecyclerView;


    static final int TYPE_HEADER = 0;
    static final int TYPE_CELL = 1;
    private TextView name_txt_big, name_txt_small;
    private ImageButton btn_small, btn_big;
    private View view;
    private int pos;
    public TestRecyclerViewAdapter(List<Task> contents, Queue<Task> taskQueue) {
        this.contents = contents;
        this.taskQueue = taskQueue;
    }


    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return TYPE_HEADER;
            default:
                return TYPE_CELL;
        }
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        this.view = null;
        switch (viewType) {
            case TYPE_HEADER: {
                this.view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_card_big, parent, false);

                name_txt_big = (TextView) view.findViewById(R.id.name_txt_big);
                btn_big = (ImageButton) view.findViewById(R.id.task_menu_btn_big);
                btn_big.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showPopup(v, 0);
                    }
                });

                name_txt_big.setText(contents.get(0).getName());
                return new RecyclerView.ViewHolder(view) {};//new RecyclerView.ViewHolder(view) {};
            }
            case TYPE_CELL: {
                this.view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_card_small, parent, false);

                mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
                final Task task = taskQueue.poll();
                name_txt_small = (TextView) view.findViewById(R.id.name_txt_small);
                btn_small = (ImageButton) view.findViewById(R.id.task_menu_btn_small);
                btn_small.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showPopup(v, task.getPosition());
                    }
                });


                name_txt_small.setText(task.getName());

                return new RecyclerView.ViewHolder(view) {};
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_HEADER:
                break;
            case TYPE_CELL:
                break;
        }
    }


    public void showPopup(View v, int pos) {
        //TODO: FIX FRAGMENT TRANSACTIONS TO DIFF THINGS
        System.out.println("POSITION-----" + pos);
        PopupMenu popup = new PopupMenu(this.view.getContext(), v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_task_dots, popup.getMenu());
        popup.show();
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.first:
                        System.out.println("EN");
                        break;
                    case R.id.second: System.out.println("TO"); break;
                }
                return true;
            }
        });
    }
}