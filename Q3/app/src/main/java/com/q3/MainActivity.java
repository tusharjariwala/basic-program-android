package com.q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button sumtext,subtext,multext,divitext,restext;
 TextView totaltext;
 EditText edittext1;
 int n1=0,n2=0,ans=0;
 String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumtext=findViewById(R.id.sumtext);
        subtext=findViewById(R.id.subtext);
        multext=findViewById(R.id.multext);
        divitext=findViewById(R.id.divitext);
        restext=findViewById(R.id.restext);
        totaltext=findViewById(R.id.totaltext);
        edittext1=findViewById(R.id.edittext1);
        sumtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1==0) {
                    n1 = Integer.parseInt(edittext1.getText().toString());
                }

                operation = "add";

                edittext1.setText("");

            }
        });
        subtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1==0) {
                    n1 = Integer.parseInt(edittext1.getText().toString());
                }

                operation = "sub";

                edittext1.setText("");

            }
        });
        multext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1==0) {
                    n1 = Integer.parseInt(edittext1.getText().toString());
                }

                operation = "mul";

                edittext1.setText("");

            }
        });
        divitext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1==0) {
                    n1 = Integer.parseInt(edittext1.getText().toString());
                }

                operation = "divied";

                edittext1.setText("");

            }
        });
        restext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(n2==0) {
                    n2 = Integer.parseInt(edittext1.getText().toString());
                }
                edittext1.setText("");
                if(operation == "add"){
                    ans = n1+n2;
                    totaltext.setText(String.valueOf(ans));
                }
                if(operation == "sub"){
                    ans = n1-n2;
                    totaltext.setText(String.valueOf(ans));
                }
                if(operation == "mul"){
                    ans = n1*n2;
                    totaltext.setText(String.valueOf(ans));
                }
                if(operation == "divied"){
                    ans = n1/n2;
                    totaltext.setText(String.valueOf(ans));
                }

            }

        });
    }
}