package com.example.s3project.SignUp_Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.s3project.R;



public class parent_signup<StudentDataModel> extends AppCompatActivity {
    Context context;
    Button btn_register;
    EditText et_name,et_Phone, et_email, et_username, et_password, et_confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_signup);
        initViews();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, login.class);
                Toast.makeText(context,"Registration Successful!",Toast.LENGTH_SHORT).show();
                //finish();
            }
        });


    }

    private void initViews() {
        et_name = findViewById(R.id.et_name);
        et_Phone = findViewById(R.id.et_Phone);
        et_email = findViewById(R.id.et_email);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        et_confirmPassword = findViewById(R.id.et_confirmPassword);

        btn_register = findViewById(R.id.btn_register);
    }

    private void registration() {
        if (validate()) {
            //StudentDataModel studentDataModel = new StudentDataModel();

            studentDataModel.setFirstName(et_first_name.getText().toString());
            studentDataModel.setLastName(et_last_name.getText().toString());
            studentDataModel.setEmail(et_email.getText().toString());
            studentDataModel.setMobile(et_mobile.getText().toString());
            studentDataModel.setUsername(et_usename.getText().toString());
            studentDataModel.setPassword(et_password.getText().toString());

            //MyDbHelper myDbHelper = new MyDbHelper(context);
        }
    }
}