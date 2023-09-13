package com.example.s3project.SignUp_Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.s3project.R;

public class login extends AppCompatActivity {

    Button btn_signup, btn_login;
    EditText et_username, et_password;
    String username, password;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = login.this;
        initViews();



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validation()) {
                    Toast.makeText(context, "Login Successful!", Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(context, studentparent.class);
                    startActivity(intent);
                    //finish();
                }
        });
    }

    private void initViews() {
        btn_signup = findViewById(R.id.btn_signup);
        btn_login = findViewById(R.id.btn_login);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
    }

    private boolean validation() {
        username = et_username.getText().toString();
        password = et_password.getText().toString();

        if (username.isEmpty()) {
            //Toast.makeText(context, "Please enter username", Toast.LENGTH_SHORT).show();
            et_username.setError("Please enter username");
            et_username.requestFocus();
            return false;
        } else if (password.isEmpty()) {
            //Toast.makeText(context, "Please enter password", Toast.LENGTH_SHORT).show();
            et_password.setError("Please enter Valid Password");
            et_password.requestFocus();
            return false;
        }
        return true;
    }


}