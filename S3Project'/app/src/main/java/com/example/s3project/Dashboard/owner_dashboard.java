package com.example.s3project.Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.s3project.Owner_Dashboard.owner_add_instructor;
import com.example.s3project.Owner_Dashboard.owner_fees;
import com.example.s3project.Owner_Dashboard.owner_reviews;
import com.example.s3project.Owner_Dashboard.owner_view_attendance;
import com.example.s3project.R;
import com.example.s3project.SignUp_Login.studentparent;

public class owner_dashboard extends AppCompatActivity {
    Context context;
    ImageButton btn_salary, btn_teacher, btn_finances, btn_review, btn_view_attendance, btn_fees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_dashboard);

        btn_teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, owner_add_instructor.class);
                startActivity(intent);
            }
        });

        btn_finances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });

        btn_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, owner_reviews.class);
                startActivity(intent);
            }
        });

        btn_salary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });

        btn_view_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, owner_view_attendance.class);
                startActivity(intent);
            }
        });

        btn_fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, owner_fees.class);
                startActivity(intent);
            }
        });
    }
}