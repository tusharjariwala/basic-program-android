package com.q8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText firstnametext,lastnametext;
Button resbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnametext=findViewById(R.id.firstnametext);
        lastnametext=findViewById(R.id.lastnametext);
        resbutton=findViewById(R.id.resbutton);
        resbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("fname",firstnametext.getText().toString());
                intent.putExtra("lname",lastnametext.getText().toString());
                startActivity(intent);

            }
        });

    }
}