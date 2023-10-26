package com.example.s3project.Owner_Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.s3project.R;

public class owner_add_instructor extends AppCompatActivity {

    Button add_instructor;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_add_instructor);

        add_instructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Added Successfully!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}