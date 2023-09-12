package com.example.s3project.SignUp_Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.s3project.R;



public class parent_signup extends AppCompatActivity {
    Context context;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_signup);

        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, login.class);
                Toast.makeText(context,"Registration Successful!",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}