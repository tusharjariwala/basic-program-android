package com.q7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nametext,agetext,addresstext,citytext,phonetext;
    Button resbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nametext=findViewById(R.id.nametext);
        agetext=findViewById(R.id.agetext);
        addresstext=findViewById(R.id.addresstext);
        citytext=findViewById(R.id.citytext);
        phonetext=findViewById(R.id.phonetext);
        resbutton=findViewById(R.id.resbutton);
        resbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("name",nametext.getText().toString());
                intent.putExtra("age",agetext.getText().toString());
                intent.putExtra("address",addresstext.getText().toString());
                intent.putExtra("city",citytext.getText().toString());
                intent.putExtra("phoneno",phonetext.getText().toString());

                startActivity(intent);
            }
        });

    }
}