package thesiscsc.thesiscsc.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import thesiscsc.thesiscsc.R;
import thesiscsc.thesiscsc.model.Task;

/**
 * Created by thang on 26.01.2017.
 */

public class TaskInfoFragment extends Fragment {
    private TextView info_test;
    private Task task;
    public void addTaskToShow(Task a) {
        this.task = a;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.task_info_view, container, false);
        info_test = (TextView) view.findViewById(R.id.test_info);
        info_test.setText(task.getName());
        return view;
    }

    @Override
    public void onResume() {

        super.onResume();

        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    getActivity().finish();
                    return true;

                }

                return false;
            }
        });
    }
}

