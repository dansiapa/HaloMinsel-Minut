package com.ranggaputra.halominsel.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.ranggaputra.halominsel.R;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    TextView forgotPassword;
    TextView signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(v -> {
            Intent login = new Intent(LoginActivity.this,HomeActivity.class);
            startActivity(login);
        });

        signUp = findViewById(R.id.tv_signUp);
        signUp.setOnClickListener(v -> {
            Intent signup = new Intent(LoginActivity.this,SignUpActivity.class);
            startActivity(signup);
        });

        forgotPassword = findViewById(R.id.tv_forgotPassword);

    }
}