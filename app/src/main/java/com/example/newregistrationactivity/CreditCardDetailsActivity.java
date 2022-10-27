package com.example.newregistrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        Button nextBtn = findViewById(R.id.next_btn);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        nextBtn.setOnClickListener(view -> {
            EditText cardNumberTxt = findViewById(R.id.card_number_txt);
            String cardNumber = cardNumberTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.card_holder_txt);
            String cardHolder = cardHolderTxt.getText().toString();
            EditText expiryTxt = findViewById(R.id.expiry_txt);
            String expiry = expiryTxt.getText().toString();
            EditText cvvTxt = findViewById(R.id.cvv_txt);
            String cvv = cvvTxt.getText().toString();
            Intent creditIntent = new Intent(this, IdentityActivity.class);
            creditIntent.putExtras(bundle);
            creditIntent.putExtra("cardNumber", cardNumber);
            creditIntent.putExtra("cardHolder", cardHolder);
            creditIntent.putExtra("expiry", expiry);
            creditIntent.putExtra("cvv", cvv);
            startActivity(creditIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}