package com.example.s3project.SignUp_Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.s3project.Dashboard.parent_dashboard;
import com.example.s3project.Data_Model.Validations;
import com.example.s3project.R;
import com.example.s3project.Data_Model.ParentDataModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class parent_signup<StudentDataModel> extends AppCompatActivity {
    Context context;
    Button btn_register;
    EditText et_name,et_Phone, et_email, et_username, et_password, et_confirmPassword;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_signup);
        initViews();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registration();
                if(validate()){
                    Intent intent = new Intent(context, parent_dashboard.class);
                    startActivity(intent);
                    Toast.makeText(context,"Registration Successful!",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(context,"Registration Failed, try again!",Toast.LENGTH_SHORT).show();
                }
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
            ParentDataModel parentDataModel = new ParentDataModel();

            parentDataModel.setName(et_name.getText().toString());
            parentDataModel.setPhone(et_Phone.getText().toString());
            parentDataModel.setEmail(et_email.getText().toString());
            parentDataModel.setUsername(et_username.getText().toString());
            parentDataModel.setPassword(et_password.getText().toString());
            parentDataModel.setConfirmPassword(et_confirmPassword.getText().toString());

            firebaseDatabase = FirebaseDatabase.getInstance();
            databaseReference = firebaseDatabase.getReference("user_details");
            //MyDbHelper myDbHelper = new MyDbHelper(context);

            databaseReference.child(parentDataModel.getUsername()).setValue(parentDataModel).addOnCompleteListener(task -> {
                et_name.setText("");
                et_Phone.setText("");
                et_email.setText("");
                et_username.setText("");
                et_password.setText("");
                et_confirmPassword.setText("");
                Toast.makeText(parent_signup.this, "User added successfully", Toast.LENGTH_SHORT).show();
                finish();
            });
        }
    }
    private boolean validate() {
        if (et_name.getText().toString().isEmpty()) {
            et_name.setError(getResources().getString(R.string.name));
            et_name.requestFocus();
            return false;
        } else if (et_Phone.getText().toString().isEmpty()) {
            et_Phone.setError(getResources().getString(R.string.contact_number));
            et_Phone.requestFocus();
            return false;
        } else if (et_email.getText().toString().isEmpty()&& Validations.isEmailValid(et_email.getText().toString())){
            et_email.setError(getResources().getString(R.string.e_mail_address));
            et_email.requestFocus();
            return false;
        } else if (et_username.getText().toString().isEmpty()) {
            et_username.setError(getResources().getString(R.string.enter_username));
            et_username.requestFocus();
            return false;
        } else if (et_password.getText().toString().isEmpty()) {
            et_password.setError(getResources().getString(R.string.set_password));
            et_password.requestFocus();
            return false;
        } else if (et_confirmPassword.getText().toString().isEmpty()) {
            et_confirmPassword.setError(getResources().getString(R.string.confirm_password));
            et_confirmPassword.requestFocus();
            return false;
        }

        return true;
    }
}