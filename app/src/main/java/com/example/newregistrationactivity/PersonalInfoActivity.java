package com.example.newregistrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
       // String emailAddress = intent.getStringExtra("emailAddress");
       // String password = intent.getStringExtra("password");
       // String confirmPassword = intent.getStringExtra("confirmPassword");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText userNameTxt = findViewById(R.id.username_txt);
            String userName = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.firstname_txt);
            String firstName = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.lastname_txt);
            String lastName = lastNameTxt.getText().toString();
           // Toast.makeText(this, emailAddress + "\t" + password + "\t" + confirmPassword + "\t" + userName + "\t" + firstName + "\t" + lastName, Toast.LENGTH_SHORT).show();
            Intent personalIntent = new Intent(this, AddressActivity.class);
            personalIntent.putExtras(bundle);
           // personalIntent.putExtra("emailAddress", emailAddress);
           // personalIntent.putExtra("password", password);
           // personalIntent.putExtra("confirmPassword", confirmPassword);
            personalIntent.putExtra("userName",userName);
            personalIntent.putExtra("firstName",firstName);
            personalIntent.putExtra("lastName",lastName);
            startActivity(personalIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
           // Intent signupIntent = new Intent(this, SignupActivity.class);
           // startActivity(signupIntent);
            finish();
        });
    }
}