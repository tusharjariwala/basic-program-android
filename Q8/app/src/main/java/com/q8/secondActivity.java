package com.q8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView displaytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        displaytext=findViewById(R.id.displaytext);
        Intent intent = getIntent();
        String name = intent.getStringExtra("fname") + intent.getStringExtra("lname");
        displaytext.setText(name);
    }
}