package com.example.two_activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView txtFullName, txtNumber, txtAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        txtFullName = findViewById(R.id.txtFullName);
        txtNumber = findViewById(R.id.txtNumber);
        txtAddress = findViewById(R.id.txtAddress);

        Intent intent = getIntent();
        String fullName = intent.getStringExtra("fullName");
        String number = intent.getStringExtra("number");
        String address = intent.getStringExtra("address");

        txtFullName.setText(fullName);
        txtNumber.setText(number);
        txtAddress.setText(address);
    }
}
