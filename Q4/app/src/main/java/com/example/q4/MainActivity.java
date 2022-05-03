package com.example.q4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button subbutton;
TextView restext;
EditText edittext1;
RadioGroup rd1;
RadioButton rb;
float val;
String eval;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subbutton=findViewById(R.id.subbutton);
        restext=findViewById(R.id.restext);
        edittext1=findViewById(R.id.edittext1);
        rd1=findViewById(R.id.rd1);
        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected=rd1.getCheckedRadioButtonId();
                rb=findViewById(selected);
                try{
                   val=Float.parseFloat(edittext1.getText().toString());
                }catch (Exception e)
                {}
                if(rb.getTag().equals("k_m"))
                {
                    eval=(val*1000)+"Metres";

                }
                if(rb.getTag().equals("m_k"))
                {
                    eval=(val/1000)+"Killometers";

                }
                if(rb.getTag().equals("m_cm"))
                {
                    eval=(val/100)+"Metres";

                }
                if(rb.getTag().equals("cm_m"))
                {
                    eval=(val*100)+"Centimeters";

                }
                restext.setText(eval);
            }
        });
    }
}