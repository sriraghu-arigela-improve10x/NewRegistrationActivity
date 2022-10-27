package com.example.newregistrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button nextBtn = findViewById(R.id.back_btn);
        nextBtn.setOnClickListener(view -> {
            EditText emailAddressTxt = findViewById(R.id.email_txt);
            String emailAddress = emailAddressTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.confirm_password_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
           // Toast.makeText(this, emailAddress + "\n" + password + "\n" + confirmPassword, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, PersonalInfoActivity.class);
            intent.putExtra("emailAddress", emailAddress);
            intent.putExtra("password", password);
            intent.putExtra("confirmPassword", confirmPassword);
            startActivity(intent);
        });
    }
}