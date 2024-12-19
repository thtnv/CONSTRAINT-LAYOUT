package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText inputUsername, inputPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn=findViewById(R.id.textViewSignUp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
        inputUsername = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnlogin);

        // Xử lý sự kiện khi bấm nút Login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredUsername = inputUsername.getText().toString();
                String enteredPassword = inputPassword.getText().toString();
                if (enteredUsername.equals(enteredUsername) && enteredPassword.equals(enteredPassword)) {
                    Toast.makeText(LoginActivity.this, "Đăng nhập thành công! Username: " + enteredUsername + ", Password: " + enteredPassword, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
