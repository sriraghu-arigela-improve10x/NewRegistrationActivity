package com.example.newregistrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("emailAddress");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastNAme = intent.getStringExtra("lastName");
        String houseNumber = intent.getStringExtra("houseNumber");
        String street = intent.getStringExtra("street");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        String country = intent.getStringExtra("country");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String placeOfBirth = intent.getStringExtra("placeOfBirth");
        String currentCompany = intent.getStringExtra("currentCompany");
        String totalExperience = intent.getStringExtra("totalExperience");
        String designation = intent.getStringExtra("designation");
        String bankName = intent.getStringExtra("bankName");
        String accountHolder = intent.getStringExtra("accountHolder");
        String accountNumber = intent.getStringExtra("accountNumber");
        String cardNumber = intent.getStringExtra("cardNumber");
        String cardHolder = intent.getStringExtra("cardHolder");
        String expiry = intent.getStringExtra("expiry");
        String cvv = intent.getStringExtra("cvv");
        String ifscCode = intent.getStringExtra("ifscCode");
        String panNumber = intent.getStringExtra("panNumber");
        String aadharNumber = intent.getStringExtra("aadharNumber");
        // Toast.makeText(this, bankName + "\t" + accountHolder + "\t" + accountNumber + "\t" + ifscCode + "\t" +emailAddress + "\t" + password + "\t" + confirmPassword + "\t" + userName + "\t" + firstName + "\t" + lastNAme + "\t" + currentCompany + "\t" + totalExperience + "\t" + designation, Toast.LENGTH_SHORT).show();
        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(emailAddress);
        TextView userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.firstname_txt);
        firstNameTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.lastname_txt);
        lastNameTxt.setText(lastNAme);
        TextView houseNumberTxt = findViewById(R.id.house_number_txt);
        houseNumberTxt.setText(houseNumber);
        TextView streetNumberTxt = findViewById(R.id.street_txt);
        streetNumberTxt.setText(street);
        TextView cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText(city);
        TextView stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText(state);
        TextView countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText(country);
        TextView dateOfBirthTxt = findViewById(R.id.dateofbirth_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        TextView placeOfBirthTxt = findViewById(R.id.placeofbirth_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        TextView currentCompanyTxt = findViewById(R.id.current_company_txt);
        currentCompanyTxt.setText(currentCompany);
        TextView totalExperienceTxt = findViewById(R.id.total_experience_txt);
        totalExperienceTxt.setText(totalExperience);
        TextView designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText(designation);
        TextView bankNameTxt = findViewById(R.id.bankname_txt);
        bankNameTxt.setText(bankName);
        TextView accountHolderNameTxt = findViewById(R.id.account_holder_name_txt);
        accountHolderNameTxt.setText(accountHolder);
        TextView accountNumberTxt = findViewById(R.id.account_number_txt);
        accountNumberTxt.setText(accountNumber);
        TextView cardNumberTxt = findViewById(R.id.card_number_txt);
        cardNumberTxt.setText(cardNumber);
        TextView cardHolderTxt = findViewById(R.id.card_holder_txt);
        cardHolderTxt.setText(cardHolder);
        TextView expiryTxt = findViewById(R.id.expiry_txt);
        expiryTxt.setText(expiry);
        TextView cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText(cvv);
        TextView ifscCodeTxt = findViewById(R.id.ifsc_txt);
        ifscCodeTxt.setText(ifscCode);
        TextView panNumberTxt = findViewById(R.id.pan_number_txt);
        panNumberTxt.setText(panNumber);
        TextView aadharNumberTxt = findViewById(R.id.aadhar_number_txt);
        aadharNumberTxt.setText(aadharNumber);

       }

}