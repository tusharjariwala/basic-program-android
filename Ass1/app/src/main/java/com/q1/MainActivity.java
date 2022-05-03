package com.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button redbutton,greenbutton,bluebutton;
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redbutton=findViewById(R.id.redbutton);
        greenbutton=findViewById(R.id.greenbutton);
        bluebutton=findViewById(R.id.bluebutton);
        textview1=findViewById(R.id.textview1);

        redbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview1.setTextColor(Color.parseColor("#FF0000"));
            }
        });
        greenbutton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview1.setTextColor(Color.parseColor("#00FF00"));
            }
        });
        bluebutton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview1.setTextColor(Color.parseColor("#0000FF"));
            }
        });
    }
}