package thesiscsc.thesiscsc.other;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.widget.CardView;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Queue;

import SicsWsTaskManagementEntryPoint.ActivitySummary;
import SicsWsTaskManagementEntryPoint.ChangeTaskStatusInput;
import SicsWsTaskManagementEntryPoint.ChangeTaskStatusSummary;
import SicsWsTaskManagementEntryPoint.DelegateActivityInput;
import SicsWsTaskManagementEntryPoint.PotentialOwnerUpdateList;
import SicsWsTaskManagementEntryPoint.SicsTaskManagementActivityReference;
import SicsWsTaskManagementEntryPoint.SicsTaskManagementProcessReference;
import SicsWsTaskManagementEntryPoint.SicsUserReference;
import SicsWsTaskManagementEntryPoint.SicsWsTaskManagementEntryPointBinding;
import SicsWsDomainSearchEntryPoint.AuthenticationToken;
import SicsWsDomainSearchEntryPoint.DbOutput;
import SicsWsDomainSearchEntryPoint.Input;
import SicsWsDomainSearchEntryPoint.SicsGenericInput;
import SicsWsDomainSearchEntryPoint.SicsWsDomainSearchEntryPointBinding;

import thesiscsc.thesiscsc.PaymentActivity;
import thesiscsc.thesiscsc.R;
import thesiscsc.thesiscsc.model.Task;
import thesiscsc.thesiscsc.model.User;
import thesiscsc.thesiscsc.asyncMethods.*;


/**
 * Created by thang on 24.01.2017.
 */

public class TestRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Task> contents;
    Queue<Task> taskQueue;
    private RecyclerView mRecyclerView;
    Context context;
    Context context1;
    View colorView;

    static List<User> userList;
    private String SERVER_ADDRESS; //http://192.168.43.115:8325
    private String username;
    private String loginToken;
    private Date exp_token;
    SharedPreferences prefs;



    static final int TYPE_HEADER = 0;
    static final int TYPE_CELL = 1;
    private TextView name_txt_big, name_txt_small, actualOwner_txt, PID_txt, status_txt;
    private ImageButton btn_small, btn_big;
    private View view;



    public TestRecyclerViewAdapter(List<Task> contents, Queue<Task> taskQueue, Context mContext) {
        this.contents = contents;
        this.taskQueue = taskQueue;
        this.context1 = mContext;

        userList = new ArrayList<>();

        prefs = mContext.getSharedPreferences("credentials", Context.MODE_PRIVATE);

        username = prefs.getString("username", "");
        loginToken = prefs.getString("signature","");
        exp_token = new Date(prefs.getLong("exp", 0));
        SERVER_ADDRESS = prefs.getString("ip","");
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
        this.context = parent.getContext();
        switch (viewType) {
            case TYPE_HEADER: {
                this.view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_card_small, parent, false);

                colorView = view.findViewById(R.id.taskStatusColor);
                name_txt_big = (TextView) view.findViewById(R.id.name_txt_small);
                actualOwner_txt = (TextView) view.findViewById(R.id.task_initiator);
                PID_txt = (TextView) view.findViewById(R.id.task_PID);
                status_txt = (TextView) view.findViewById(R.id.task_status);
                btn_big = (ImageButton) view.findViewById(R.id.task_menu_btn_small);

                CardView cardView = (CardView) view.findViewById(R.id.card_view);
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            if (contents.get(0).getStartActionType().equals("OPENWKS") && contents.get(0).nlsName.equals("Authorize and Close Remittance")) {
                                System.out.println("Payment Task");
                                startPaymentActivity(contents.get(0));
                            } else {
                                detailsTask(contents.get(0));
                            }
                        }
                });

                btn_big.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showPopup(v, 0);
                    }
                });

                if (contents.get(0).getStatus() != null) {
                    if (contents.get(0).getStatus().equals("RESERVED")) {
                        colorView.setBackgroundColor(Color.rgb(255,140,0));
                    } else if (contents.get(0).getStatus().equals("INPROGRESS")) {
                        colorView.setBackgroundColor(Color.rgb(146, 227, 132));
                    }
                }
                if (contents.get(0).getStartActionType().equals("OPENWKS") && contents.get(0).nlsName.equals("Authorize and Close Remittance")) {
                    colorView.setBackgroundColor(Color.rgb(71, 129, 255));
                }
                name_txt_big.setText(contents.get(0).getTaskName());
                actualOwner_txt.setText(contents.get(0).getActualOwner());
                PID_txt.setText(contents.get(0).getPID());
                status_txt.setText(contents.get(0).getStatus());
                return new RecyclerView.ViewHolder(view) {};//new RecyclerView.ViewHolder(view) {};
            }
            case TYPE_CELL: {
                this.view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_card_small, parent, false);

                mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
                final Task task = taskQueue.poll();
                colorView = view.findViewById(R.id.taskStatusColor);
                name_txt_small = (TextView) view.findViewById(R.id.name_txt_small);
                actualOwner_txt = (TextView) view.findViewById(R.id.task_initiator);
                PID_txt = (TextView) view.findViewById(R.id.task_PID);
                status_txt = (TextView) view.findViewById(R.id.task_status);
                btn_small = (ImageButton) view.findViewById(R.id.task_menu_btn_small);

                CardView cardView = (CardView) view.findViewById(R.id.card_view);
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (task.getStartActionType().equals("OPENWKS") && task.nlsName.equals("Authorize and Close Remittance")) {
                            System.out.println("Payment Task");
                            startPaymentActivity(task);
                        } else {
                            detailsTask(task);
                        }
                    }
                });

                btn_small.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showPopup(v, task.getPosition());
                    }
                });

                if (task.getStatus().equals("RESERVED")){
                    colorView.setBackgroundColor(Color.rgb(255,140,0));
                } else if (task.getStatus().equals("INPROGRESS")){
                    colorView.setBackgroundColor(Color.rgb(146, 227, 132));
                }
                if (task.getStartActionType().equals("OPENWKS") && task.nlsName.equals("Authorize and Close Remittance")) {
                    colorView.setBackgroundColor(Color.rgb(71, 129, 255));
                }

                if (task != null) {
                    name_txt_small.setText(task.getTaskName());
                    actualOwner_txt.setText(task.getActualOwner());
                    PID_txt.setText(task.getPID());
                    status_txt.setText(task.getStatus());
                }

                return new RecyclerView.ViewHolder(view) {};
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (getItemViewType(position)) {
            case TYPE_HEADER:
                btn_big.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showPopup(v, 0);
                    }
                }); break;
            case TYPE_CELL:
                break;
        }
    }

    public void showPopup(View v, int pos) {
        PopupMenu popup = new PopupMenu(this.view.getContext(), v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_task_dots, popup.getMenu());
        final int finalPos = pos;

        popup.show();
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.delegate: delegeteTask(contents.get(finalPos)); break;
                    case R.id.mark_complete: completeTask(contents.get(finalPos)); break;
                    case R.id.mark_failed: failTask(contents.get(finalPos)); break;
                    case R.id.details: detailsTask(contents.get(finalPos)); break;
                }
                return true;
            }
        });
    }

    private void delegeteTask(Task task) {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.delegate_popup);
        final Task finalTask1 = task;
        final ListView delegateList = (ListView) dialog.findViewById(R.id.delegate_listview);
        delegateList.setClickable(true);
        delegateList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final User user = (User) delegateList.getItemAtPosition(position);
                final Dialog insideDialog = new Dialog(context);
                final Task finalTask2 = finalTask1;
                insideDialog.setContentView(R.layout.delegate_popup_confirm);
                TextView nameField = (TextView) insideDialog.findViewById(R.id.name_text_user);
                Button btnCancel = (Button) insideDialog.findViewById(R.id.cancel_btn);
                Button btnConfirm = (Button) insideDialog.findViewById(R.id.delegate_btn);
                nameField.setText(user + "?");



                btnCancel.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        insideDialog.dismiss();
                    }
                });
                btnConfirm.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       new excecuteDelegateTaskService().execute(user.getUser_Id(), finalTask2.processIdentifier, finalTask2.internalName);
                        Toast.makeText(context, "Delegated task to " + user.toString(), Toast.LENGTH_SHORT).show();
                        insideDialog.dismiss();
                    }
                });

                insideDialog.show();
            }
        });

        try{
            ExecuteSearchService executeSearchService = new ExecuteSearchService(this.context);
            userList = executeSearchService.execute("select USER_ID, FIRSTNAME, LASTNAME from cnu_user").get();

        } catch (Exception e){

        }

        User[] listItems = new User[userList.size()];
        for(int i = 0; i < userList.size(); i++){
            listItems[i] = userList.get(i);
        }
        ArrayAdapter adapter = new ArrayAdapter(view.getContext(), android.R.layout.simple_list_item_1, listItems) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView textView = (TextView) super.getView(position, convertView, parent);
                textView.setTextColor(Color.BLACK);
                return textView;
            }
        };
        delegateList.setAdapter(adapter);
        dialog.show();
    }

    private void completeTask(Task task) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mark_complete_popup);
        Button btnComplete = (Button) dialog.findViewById(R.id.complete_btn);
        Button btnCancel = (Button) dialog.findViewById(R.id.cancelComplete_btn);
        final Task finalTask = task;
        btnComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new excecuteChangeStatusTaskService().execute(finalTask.processIdentifier, finalTask.status.subclassNumber + "", "COMPLETED");
                Toast.makeText(context, "Task marked as completed", Toast.LENGTH_SHORT).show();
                dialog.dismiss();            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void failTask(Task task) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mark_failed_popup);
        Button btnFailed = (Button) dialog.findViewById(R.id.failed_btn);
        Button btnCancel = (Button) dialog.findViewById(R.id.cancelFailed_btn);
        final Task finalTask = task;
        btnFailed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new excecuteChangeStatusTaskService().execute(finalTask.processIdentifier, finalTask.status.subclassNumber + "", "FAILED");
                Toast.makeText(context, "Task marked as failed", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void detailsTask(Task task) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.details_popup);
        Button btnOk = (Button) dialog.findViewById(R.id.details_ok_btn);
        TextView detailText = (TextView) dialog.findViewById(R.id.textView_name);
        TextView updateText = (TextView) dialog.findViewById(R.id.textView_lastUpdate);
        TextView statusText = (TextView) dialog.findViewById(R.id.textView_status);
        TextView ownerText = (TextView) dialog.findViewById(R.id.textView_owner);
        TextView processText = (TextView) dialog.findViewById(R.id.textView_process);
        final Task finalTask = task;
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        detailText.setText(task.nlsName);
        updateText.setText(task.lastUpdatedTimeStamp + "");
        statusText.setText(task.status.code);
        ownerText.setText(task.actualOwner.userId);
        processText.setText("Process: " + task.subProcess);

        dialog.show();
    }
    private void startPaymentActivity(Task a) {
        Intent intent = new Intent(context1, PaymentActivity.class);
        intent.putExtra("task", a);
        context1.startActivity(intent);
    }

    /*
        class executeSearchService extends AsyncTask<String, Void, String> {


            @Override
            protected void onPostExecute(String s) {}

            @Override
            protected String doInBackground(String... params) {

                SicsGenericInput param0 = new SicsGenericInput();

                AuthenticationToken token = new AuthenticationToken();

                token.userId = username;
                token.signature = loginToken;
                token.expiration = exp_token;
                param0.authenticationToken = token;

                Input param1 = new Input();

                SicsWsDomainSearchEntryPoint.SQLSpecification SQLSpecification = new SicsWsDomainSearchEntryPoint.SQLSpecification();
                SQLSpecification.sqlStatement = "select USER_ID, FIRSTNAME, LASTNAME from cnu_user";
                param1.inputSQLSpecification = SQLSpecification;


                SicsWsDomainSearchEntryPointBinding service = new SicsWsDomainSearchEntryPointBinding(null,"http://"+ SERVER_ADDRESS + "/SwanLake/SicsWSServlet");

                try{
                    DbOutput res = service.executeSearch(param0,param1);
                    userList = res.getUserList();

                    for (User u: userList) {
                        if(u.getUser_Id().equals(username)){
                            userList.remove(u);
                        }
                    }

                }catch (Exception e){
                    Log.d("TEST", Log.getStackTraceString(e));
                }
                return null;
            }
        }
    */
    class excecuteDelegateTaskService extends AsyncTask<String, String, String> {


        @Override
        protected void onPostExecute(String s) {

        }

        @Override
        protected String doInBackground(String... params) {

            SicsWsTaskManagementEntryPoint.SicsGenericInput param0 = new SicsWsTaskManagementEntryPoint.SicsGenericInput();
            DelegateActivityInput param1 = new DelegateActivityInput();

            SicsWsTaskManagementEntryPoint.AuthenticationToken token = new SicsWsTaskManagementEntryPoint.AuthenticationToken();

            token.userId = username;
            token.signature = loginToken;
            token.expiration = exp_token;
            param0.authenticationToken = token;

            SicsTaskManagementActivityReference activityReference = new SicsTaskManagementActivityReference();

            activityReference.processIdentifier = params[1];
            activityReference.internalName = params[2];

            param1.activityReference = activityReference;

            PotentialOwnerUpdateList potentialOwnerList = new PotentialOwnerUpdateList();
            SicsUserReference userReference = new SicsUserReference();
            userReference.userId = params[0];
            potentialOwnerList.potentialOwner.add(userReference);

            param1.potentialOwnerList = potentialOwnerList;

            SicsWsTaskManagementEntryPointBinding service = new SicsWsTaskManagementEntryPointBinding(null,"http://"+ SERVER_ADDRESS + "/SwanLake/SicsWSServlet");


            try{

                ActivitySummary res = service.delegateActivity(param0,param1);
            }catch (Exception e){

                Log.d("TEST", Log.getStackTraceString(e));
            }


            return null;
        }
    }

    class excecuteChangeStatusTaskService extends AsyncTask<String, String, String> {


        @Override
        protected void onPostExecute(String s) {

        }

        @Override
        protected String doInBackground(String... params) {
            Log.d("STATUS", params[2]);

            SicsWsTaskManagementEntryPoint.SicsGenericInput param0 = new SicsWsTaskManagementEntryPoint.SicsGenericInput();

            ChangeTaskStatusInput param1 = new ChangeTaskStatusInput();

            SicsWsTaskManagementEntryPoint.AuthenticationToken token = new SicsWsTaskManagementEntryPoint.AuthenticationToken();

            token.userId = username;
            token.signature = loginToken;
            token.expiration = exp_token;
            param0.authenticationToken = token;

            SicsTaskManagementProcessReference processReference = new SicsTaskManagementProcessReference();
            processReference.processIdentifier = params[0];


            SicsWsTaskManagementEntryPoint.SicsReferenceDataReference sicsReferenceData = new SicsWsTaskManagementEntryPoint.SicsReferenceDataReference();
            sicsReferenceData.code = params[2];
            sicsReferenceData.subclassNumber = Integer.parseInt(params[1]);

            param1.processReference = processReference;
            param1.status = sicsReferenceData;


            SicsWsTaskManagementEntryPointBinding service = new SicsWsTaskManagementEntryPointBinding(null,"http://"+ SERVER_ADDRESS + "/SwanLake/SicsWSServlet");


            try{
                ChangeTaskStatusSummary res = service.changeTaskStatus(param0,param1);
            }catch (Exception e){
                Log.d("TEST", Log.getStackTraceString(e));
            }


            return null;
        }
    }


}