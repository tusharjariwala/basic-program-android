package com.q6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView displaytext,displayaddresstext,displayagetext,displaygendertext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        displaytext=findViewById(R.id.displaytext);
        displayaddresstext=findViewById(R.id.displayaddresstext);
        displayagetext=findViewById(R.id.displayagetext);
        displaygendertext=findViewById(R.id.displaygendertext);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        displaytext.setText(name);
        String addres = intent.getStringExtra("address");
        displayaddresstext.setText(addres);
        String age = intent.getStringExtra("age");
        displayagetext.setText(age);
        String gender = intent.getStringExtra("gender");
        displaygendertext.setText(gender);

    }
}