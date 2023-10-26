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


import com.example.s3project.Dashboard.student_dashboard;
import com.example.s3project.R;

import java.util.Calendar;
import java.text.SimpleDateFormat;


public class student_signup extends AppCompatActivity {
    Context context;

    Button btn_register;
    //ImageCapture imageCapture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_signup);
    }

    public class MyDatePicker extends AppCompatActivity {
        CalendarView calendarView;
        Button btn_date;
        TextView tv_dob;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            btn_register = findViewById(R.id.btn_register);
            btn_date = findViewById(R.id.btn_date);
            tv_dob = findViewById(R.id.tv_dob);

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_student_signup);


            btn_date.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDatePicker();
                }
            });

            btn_register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, student_dashboard.class);
                    Toast.makeText(context, "Registration Successful!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
        }


        private void showDatePicker() {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog = new DatePickerDialog(MyDatePicker.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                            String formattedDate = getFormattedDate(day, month, year);
                            tv_dob.setText(formattedDate);
                        }
                    }, year, month, dayOfMonth);
            datePickerDialog.show();
        }

        private String getFormattedDate(int dayOfMonth, int month, int year) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            cal.set(Calendar.MONTH, month);
            String DATE_FORMAT = "EE, MMM dd, yyyy";
//        String DATE_FORMAT = "EEE-dd-MM-yyyy";
//        String DATE_FORMAT = "E, MMM d, yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            return sdf.format(cal.getTime());
        }
    }
}