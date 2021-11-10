package com.example.mobilecomputingtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String alphabet=getIntent().getStringExtra("keyname2");
        btn1=findViewById(R.id.button10);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ض"))
                {
                    GlobalVariable.glob++;
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        btn2=findViewById(R.id.button11);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ل"))
                {
                    GlobalVariable.glob++;
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        btn3=findViewById(R.id.button12);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ن"))
                {
                    GlobalVariable.glob++;
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        btn4=findViewById(R.id.button16);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ر"))
                {
                    GlobalVariable.glob++;
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        btn5=findViewById(R.id.button15);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ت") || alphabet.equals("د") || alphabet.equals("ط"))
                {
                    GlobalVariable.glob++;
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        btn6=findViewById(R.id.button13);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ظ") || alphabet.equals("ذ") || alphabet.equals("ث"))
                {
                    GlobalVariable.glob++;
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        btn7=findViewById(R.id.button14);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alphabet.equals("ص") || alphabet.equals("ز") || alphabet.equals("س"))
                {
                    GlobalVariable.glob++;
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    intent=new Intent(MainActivity3.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}