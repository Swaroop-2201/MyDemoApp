package com.example.s3project.Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.s3project.R;
import com.example.s3project.Student_Dashboard.student_attendance;
import com.example.s3project.Student_Dashboard.student_reports;
import com.example.s3project.Student_Dashboard.student_review;

public class student_dashboard extends AppCompatActivity {
    Context context;
    ImageButton btn_attendance,btn_reports,btn_fees,btn_review;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        btn_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, student_attendance.class);
                startActivity(intent);
            }
        });
        btn_reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, student_reports.class);
                startActivity(intent);
            }
        });
        btn_fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Coming soon!",Toast.LENGTH_SHORT).show();
            }
        });
        btn_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, student_review.class);
                startActivity(intent);
            }
        });
    }
}