package thesiscsc.thesiscsc;

import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;


import com.google.firebase.iid.FirebaseInstanceId;

import java.util.Date;


import butterknife.ButterKnife;
import butterknife.InjectView;
import SicsWsAdministrationEntryPoint.LoginInput;
import SicsWsAdministrationEntryPoint.SicsWsAdministrationEntryPointBinding;
import thesiscsc.thesiscsc.fragment.SettingsFragment;

public class LoginActivity extends AppCompatActivity {
    private static final int REQUEST_SIGNUP = 0;
    private SharedPreferences prefs;

    //---------------
    String ip = "192.168.43.197:8080";
    //String ip = "10.0.0.60:8080";
    //String ip = "88.89.219.196:8080";
    //---------------

    String address = "http://" + ip + "/SwanLake/SicsWSServlet";
    String loginToken = "";
    Date loginExpiration;
    private SicsWsAdministrationEntryPointBinding adminService = new SicsWsAdministrationEntryPointBinding(null, ip);
    public static final String EXTRA_MESSAGE = "SOMETHING";

    @InjectView(R.id.input_email) EditText _usernameText;
    @InjectView(R.id.input_password) EditText _passwordText;
    @InjectView(R.id.btn_login) Button _loginButton;
    @InjectView(R.id.relativeSettings) RelativeLayout relativeSettings;
    @InjectView(R.id.btn_settings) Button _settingsButton;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        prefs = getSharedPreferences("credentials", Context.MODE_PRIVATE);
        ButterKnife.inject(this);
        String s = getIntent().getStringExtra("SERVER_GONE");
        spinner = (Spinner) findViewById(R.id.spinner);

        spinner.getBackground().setColorFilter(Color.parseColor("#000000"), PorterDuff.Mode.SRC_ATOP);
        spinner.setDropDownWidth(520);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.IPs, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        if(s != null){
            relativeSettings.setVisibility(View.VISIBLE);
        }

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("FIREBASETOKEN", "Refreshed token: " + refreshedToken);

        if (getIntent().hasExtra("run_activity")) {
            handleFirebaseNotificationIntent(getIntent());
        }

        prefs.edit().putString("iptest", "iptest").apply();
        prefs.edit().putString("ip", ip).apply();

        String username = prefs.getString("username", "");
        String password = prefs.getString("password", "");
        System.out.println(username);

/*
        String firebaseToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("firebaseToken", firebaseToken);

        prefs.edit().putString("firebaseToken", firebaseToken).apply();

        if (getIntent().getExtras() != null) {
            Log.d("intent",getIntent().getExtras().get("body").toString());
            Intent intent = new Intent(LoginActivity.this, PaymentActivity.class);

            String message = getIntent().getExtras().get("body").toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            Log.d("intent", "empty");
        }
        */

        _usernameText.setText("SICSPC");
        _passwordText.setText("SICSPC");

        _loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //login();
                new CallLoginService().execute(_usernameText.getText().toString(), _passwordText.getText().toString());
            }
        });

        _settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("ip", spinner.getSelectedItem().toString() + ":8080").apply();
                Toast.makeText(getBaseContext(), "'" + spinner.getSelectedItem().toString() + "' set as new server IP.", Toast.LENGTH_SHORT).show();
            }
        });

        if(!username.equals("") && !password.equals("")) {
            login();
        }

    }

    public void login() {
        String username = prefs.getString("username", "");
        String password = prefs.getString("password", "");

        if(!username.equals("") && !password.equals("")) {
            if(!validate(username, password)){
                onLoginFailed();
                return;
            }
        } else {
            if (!validate(_usernameText.getText().toString(), _passwordText.getText().toString())) {
                onLoginFailed();
                return;
            }
        }
        onLoginSuccess();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_SIGNUP) {
            if (resultCode == RESULT_OK) {

                // TODO: Implement successful signup logic here
                // By default we just finish the Activity and log them in automatically
                this.finish();
            }
        }
    }

    @Override
    public void onBackPressed() {
        // disable going back to the LoginActivity
        moveTaskToBack(true);
    }

    public void onLoginSuccess() {
        System.out.println("SUCCESS!!!");
        _loginButton.setEnabled(true);
        Toast.makeText(getBaseContext(), "Login successful!", Toast.LENGTH_LONG).show();

        Intent i = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(i);

        finish();

    }

    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();

        _loginButton.setEnabled(true);
    }

    public boolean validate(String usern, String pw) {
        boolean valid = true;
        String username;
        String password;
        String token = "";

        if(usern.equals("") && pw.equals("")){
            username = usern;
            password = pw;
        } else {
            username = _usernameText.getText().toString();
            password = _passwordText.getText().toString();
            token = ""; //TODO: GET TOKEN HERE!
        }

        if (username.isEmpty() ) {
            _usernameText.setError("enter a valid username");
            valid = false;
        } else {
            _usernameText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            _passwordText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        if(valid && usern.equals("") && pw.equals("")) {
            prefs.edit().putString("username", username).apply();
            prefs.edit().putString("password", password).apply();
            prefs.edit().putString("token", token).apply();
        }

        return valid;
    }


    class CallLoginService extends AsyncTask<String, Void, String> {
        String lUsername = "";
        String lPassword = "";
        String lToken = "";
        ProgressDialog progressDialog;
        Date exp = null;

        @Override
        protected void onPostExecute(String s) {
            if (s.equals("OK")) {
                _loginButton.setEnabled(true);
                prefs.edit().putString("username", lUsername).apply();
                prefs.edit().putString("password", lPassword).apply();
                prefs.edit().putString("signature", lToken).apply();
                prefs.edit().putLong("exp", exp.getTime()).apply();

                progressDialog.dismiss();
                login();
            } else {
                _loginButton.setEnabled(false);
                progressDialog.dismiss();
            }
        }

        @Override
        protected void onPreExecute() {
            progressDialog = new ProgressDialog(LoginActivity.this, R.style.AppTheme_Dark_Dialog);
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage("Authenticating...");
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {
            String statusText;
            LoginInput param0 = new LoginInput();
            param0.userId = params[0];
            param0.password = params[1];
            this.lUsername = param0.userId;
            this.lPassword = param0.password;

            SicsWsAdministrationEntryPointBinding service = new SicsWsAdministrationEntryPointBinding(null, address);
            try {
                SicsWsAdministrationEntryPoint.AuthenticationToken res = service.login(param0);
                lToken = res.signature;
                loginExpiration = res.expiration;
                this.exp = loginExpiration;

                statusText = "OK";
            } catch (Exception e) {
                Toast.makeText(getBaseContext(), "Servers down", Toast.LENGTH_LONG).show();
                statusText = "ERROR";
            }
            return statusText;
        }
    }


    private void handleFirebaseNotificationIntent(Intent intent){
        String className = intent.getStringExtra("run_activity");
        startSelectedActivity(className, intent.getExtras());
    }

    private void startSelectedActivity(String className, Bundle extras){
        Class cls;
        try {
            cls = Class.forName(className);
        }catch(ClassNotFoundException e){
            cls = null;
        Log.d("error", e.toString());
        }
        Intent i = new Intent(LoginActivity.this, cls);

        if (i != null) {
            i.putExtras(extras);
            this.startActivity(i);
        }
    }
}
