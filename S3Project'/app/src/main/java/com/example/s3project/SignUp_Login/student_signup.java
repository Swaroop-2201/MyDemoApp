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


import com.example.s3project.R;

import java.util.Calendar;

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
        TextView et_date;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            btn_register = findViewById(R.id.btn_register);

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_student_signup);
            et_date.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDatePickerDialog();
                }
            });

            btn_register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, login.class);
                    Toast.makeText(context,"Registration Successful!",Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
        }


        private void showDatePickerDialog() {
            // Get the current date as the default date in the date picker dialog
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            // Create a date picker dialog
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDayOfMonth) {
                            // Handle the selected date (e.g., update the EditText with the selected date)
                            et_date.setText(selectedDayOfMonth + "/" + (selectedMonth + 1) + "/" + selectedYear);
                        }
                    },
                    year, month, day);

            // Show the date picker dialog
            datePickerDialog.show();
        }
    }
}