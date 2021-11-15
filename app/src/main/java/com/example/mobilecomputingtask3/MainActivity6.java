package com.example.mobilecomputingtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        String alphabet=getIntent().getStringExtra("keyname");

        btn1=findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ف"))
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity6.this,MainActivity.class);
                    startActivity(intent2);

                }
            }
        });

        btn2=findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ب"))
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity6.this,MainActivity.class);
                    startActivity(intent2);

                }
            }
        });




        btn4=findViewById(R.id.button24);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("و"))
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity6.this,MainActivity.class);
                    startActivity(intent2);

                }
            }
        });
    }
}