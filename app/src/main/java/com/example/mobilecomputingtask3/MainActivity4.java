package com.example.mobilecomputingtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button btn1,btn2,btn3;
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        String alphabet=getIntent().getStringExtra("keyname");

        btn1=findViewById(R.id.button17);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ق"))
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity4.this,MainActivity5.class);
                    startActivity(intent2);

                }
            }
        });

        btn2=findViewById(R.id.button18);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ك"))
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity4.this,MainActivity5.class);
                    startActivity(intent2);

                }
            }
        });


        btn3=findViewById(R.id.button19);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ج") || alphabet.equals("ش") || alphabet.equals("ي") )
                {
                    GlobalVariable.glob++;
                    intent2=new Intent(MainActivity4.this,MainActivity5.class);
                    startActivity(intent2);

                }
            }
        });

    }
}