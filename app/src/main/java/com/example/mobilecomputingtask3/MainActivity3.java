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



    }
}