package com.example.two_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText addFullName, addNumber, addAddress;
    TextView txtCode;
    Button sendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        addFullName = findViewById(R.id.fullName);
        addNumber = findViewById(R.id.phoneName);
        addAddress = findViewById(R.id.address);
        sendBtn = findViewById(R.id.buttonSave);
        txtCode = findViewById(R.id.code);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTxt = addFullName.getText().toString();
                String number = addNumber.getText().toString();
                String codeTxt = txtCode.getText().toString();
                String numberWithCode=codeTxt+number;
                String txtAddress=addAddress.getText().toString();
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("fullName",nameTxt);
                intent.putExtra("number",numberWithCode);
                intent.putExtra("address",txtAddress);
                startActivity(intent);
            }
        });


    }
}