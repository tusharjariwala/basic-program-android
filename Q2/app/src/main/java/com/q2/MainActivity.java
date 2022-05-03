package com.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button smalltext,mediumtext,largertext;
  TextView changetext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smalltext=findViewById(R.id.smalltext);
        mediumtext=findViewById(R.id.mediumtext);
        largertext=findViewById(R.id.largertext);
        changetext=findViewById(R.id.changetext);
        smalltext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changetext.setTextSize(20);
            }
        });
        mediumtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changetext.setTextSize(30);
            }
        });
        largertext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changetext.setTextSize(50);
            }
        });
    }

}