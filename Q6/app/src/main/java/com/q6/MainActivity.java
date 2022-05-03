package com.q6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText nametext,addresstext,agetext,gendertext;
Button resbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nametext=findViewById(R.id.nametext);
        addresstext=findViewById(R.id.addresstext);
        agetext=findViewById(R.id.agetext);
        gendertext=findViewById(R.id.gendertext);

        resbutton=findViewById(R.id.resbutton);
        resbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("name",nametext.getText().toString());
                intent.putExtra("address",addresstext.getText().toString());
                intent.putExtra("age",agetext.getText().toString());
                intent.putExtra("gender",gendertext.getText().toString());

                startActivity(intent);
            }
        });

    }
}