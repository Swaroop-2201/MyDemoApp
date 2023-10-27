package com.example.s3project.Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.contentcapture.ContentCaptureCondition;
import android.widget.ImageButton;

import com.example.s3project.Owner_Dashboard.owner_view_attendance;
import com.example.s3project.R;
import com.example.s3project.Teacher_dashboard.add_batch;
import com.example.s3project.Teacher_dashboard.teacher_add_report;
import com.example.s3project.Teacher_dashboard.teacher_attendance;
import com.example.s3project.Teacher_dashboard.teacher_receive_fees;

public class teacher_dashboard extends AppCompatActivity {
    Context context;
    ImageButton btn_reports,btn_batch,btn_receive_fees,btn_attendance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_dashboard);

        btn_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, teacher_attendance.class);
                startActivity(intent);
            }
        });
        btn_receive_fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, teacher_receive_fees.class);
                startActivity(intent);
            }
        });
        btn_batch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, add_batch.class);
                startActivity(intent);
            }
        });
        btn_reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, teacher_add_report.class);
                startActivity(intent);
            }
        });
    }
}