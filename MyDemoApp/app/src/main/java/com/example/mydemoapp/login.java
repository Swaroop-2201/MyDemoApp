package com.example.mydemoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

class loginActivity extends AppCompatActivity {

    private TextInputLayout usernameLayout, passwordLayout;
    private EditText usernameEditText, passwordEditText;
    private Button loginButton, signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameLayout = findViewById(R.id.usernameLayout);
        passwordLayout = findViewById(R.id.passwordLayout);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        signupButton = findViewById(R.id.signupButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform login validation and authentication here
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (isValidCredentials(username, password)) {
                    // Successful login, navigate to the main activity or perform other actions
                    Toast.makeText(loginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    // Invalid credentials, show an error message
                    usernameLayout.setError("Invalid username or password");
                    passwordLayout.setError("Invalid username or password");
                }
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle signup button click, navigate to the signup activity, etc.
            }
        });
    }

    private boolean isValidCredentials(@NonNull String username, @NonNull String password) {
        // Implement your validation logic here (e.g., check against a database)
        return username.equals("example") && password.equals("password");
    }
}
