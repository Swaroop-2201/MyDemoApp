package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {


    Button btn_signin,btn_signup;
    String username,password;
    Context context;
    EditText et_name,et_password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        context = login.this;

        btn_signup = findViewById(R.id.btn_signup);
        btn_signin = findViewById(R.id.btn_signin);
        et_name = findViewById(R.id.et_name);
        et_password = findViewById(R.id.et_password);


        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               login();
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,signup.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void login() {
        if (validation()) {
            if (username.equals("abc") && password.equals("123")) {
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(context, "Failed, User not found", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean validation() {
        username = et_name.getText().toString();
        password = et_password.getText().toString();

        if (username.isEmpty()) {
            Toast.makeText(context, "Please enter username", Toast.LENGTH_SHORT).show();
//            et_username.setError("Please enter username");
            et_name.requestFocus();
            return false;
        } else if (password.isEmpty()) {
            Toast.makeText(context, "Please enter password", Toast.LENGTH_SHORT).show();
            et_password.requestFocus();
            return false;
        }
        return true;
    }
}