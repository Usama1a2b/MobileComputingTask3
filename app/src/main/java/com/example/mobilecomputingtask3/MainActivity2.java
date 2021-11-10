package com.example.mobilecomputingtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    Button btn1,btn2,btn3;
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String alphabet=getIntent().getStringExtra("keyname");

        btn1=findViewById(R.id.button7);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ا") || alphabet.equals("ه"))
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent2);

                }
            }
        });

        btn2=findViewById(R.id.button8);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ع") || alphabet.equals("ح"))
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent2);

                }
            }
        });


        btn3=findViewById(R.id.button9);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("غ") || alphabet.equals("خ"))
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent2);

                }
            }
        });





    }
}