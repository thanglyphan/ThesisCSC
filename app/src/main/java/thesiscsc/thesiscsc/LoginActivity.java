package thesiscsc.thesiscsc;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
    private SharedPreferences prefs;

    @InjectView(R.id.input_email) EditText _usernameText;
    @InjectView(R.id.input_password) EditText _passwordText;
    @InjectView(R.id.btn_login) Button _loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        prefs = getSharedPreferences("credentials", Context.MODE_PRIVATE);
        ButterKnife.inject(this);

        String username = prefs.getString("username", "");
        String password = prefs.getString("password", "");
        System.out.println(username);

        _loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        if(!username.equals("") && !password.equals("")) {
            login();
        }
    }

    public void login() {
        Log.d(TAG, "Login");

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


        _loginButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this, R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onLoginSuccess or onLoginFailed
                        onLoginSuccess();
                        // onLoginFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
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
        String username = "";
        String password = "";

        if(usern != "" && pw != ""){
            username = usern;
            password = pw;
        } else {
            username = _usernameText.getText().toString();
            password = _passwordText.getText().toString();
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

        if(valid && usern != "" && pw != "") {
            prefs.edit().putString("username", username).apply();
            prefs.edit().putString("password", password).apply();
        }

        return valid;
    }
}
