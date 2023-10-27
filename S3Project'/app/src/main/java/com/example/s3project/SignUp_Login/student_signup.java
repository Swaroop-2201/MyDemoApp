package com.example.s3project.SignUp_Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.app.DatePickerDialog;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
//import androidx.camera.core.ImageCapture;


import com.example.s3project.Dashboard.parent_dashboard;
import com.example.s3project.Dashboard.student_dashboard;
import com.example.s3project.R;

import java.util.Calendar;
import java.text.SimpleDateFormat;


public class student_signup extends AppCompatActivity {
    Context context;

    Button btn_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_signup);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, student_dashboard.class);
                startActivity(intent);

                Toast.makeText(context,"Registration Successful!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
