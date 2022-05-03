package com.q5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox sandwichtext,Pastatext,Pizzatext,Burgertext;
  TextView res;
  Button orderbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sandwichtext=findViewById(R.id.sandwichtext);
        Pastatext=findViewById(R.id.Pastatext);
        Pizzatext=findViewById(R.id.Pizzatext);
        Burgertext=findViewById(R.id.Burgertext);
        orderbutton=findViewById(R.id.orderbutton);
        res=findViewById(R.id.res);
        orderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("select Items: ");

                if(sandwichtext.isChecked())
                {
                    result.append("\nsandwich 80rs");
                    totalamount+=80;
                }
                if(Pastatext.isChecked())
                {
                    result.append("\nPasta 200rs");
                    totalamount+=200;
                }
                if(Pizzatext.isChecked())
                {
                    result.append("\npizza 100rs");
                    totalamount+=100;
                }
                if(Burgertext.isChecked())
                {
                    result.append("\nBurger 60rs");
                    totalamount+=60;
                }
                result.append("\ntotal :"+totalamount+"RS");
                res.setText(result);
            }
        });


    }
}