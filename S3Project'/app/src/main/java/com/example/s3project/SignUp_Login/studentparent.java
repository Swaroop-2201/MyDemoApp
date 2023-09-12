package com.example.s3project.SignUp_Login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.s3project.R;

public class studentparent extends AppCompatActivity {

    ImageButton imageButton_student,imageButton_parent;
    Context context;

    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentparent);

        context = studentparent.this;
        imageButton_student = findViewById(R.id.imageButton_student);
        imageButton_parent = findViewById(R.id.imageButton_parent);

        imageButton_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, parent_signup.class);
                startActivity(intent);
                finish();
            }
        });

        imageButton_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, student_signup.class);
                startActivity(intent);
                finish();
            }
        });
    }
}