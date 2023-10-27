package com.example.s3project.Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.s3project.Parent_Dashboard.parent_view_attendance;
import com.example.s3project.Parent_Dashboard.parent_view_report;
import com.example.s3project.Parent_Dashboard.review;
import com.example.s3project.R;
import com.example.s3project.Student_Dashboard.student_attendance;
import com.example.s3project.Student_Dashboard.student_reports;
import com.example.s3project.Student_Dashboard.student_review;

public class parent_dashboard extends AppCompatActivity {
    Context context;
    ImageButton btn_view_attendance,btn_review,btn_fees,btn_reports;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_dashboard);

        btn_fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Coming soon!",Toast.LENGTH_SHORT).show();
            }
        });
        btn_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, review.class) ;
                startActivity(intent);
            }
        });
        btn_view_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, parent_view_attendance.class);
                startActivity(intent);
            }
        });
        btn_reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, parent_view_report.class);
                startActivity(intent);
            }
        });
    }
}