package com.example.mobilecomputingtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button move,move2;
    TextView text;
    String [] ArabicLetters={"ا","ب","ت","ث","ج","ح","خ","د","ذ","ر","ز","س","ش","ص","ض","ط","ظ","ع","غ","ف","ق","ك","ل","م","ن","ه","و","ي"};
    Random dice=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //random number generated
        int number= dice.nextInt(28);
        text=findViewById(R.id.textView);

        //random alphabet show in text field
        text.setText(ArabicLetters[number]);

        //Throat section
        move2=findViewById(R.id.button2);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ArabicLetters[number].equals("ا") || ArabicLetters[number].equals("ه") || ArabicLetters[number].equals("ع") || ArabicLetters[number].equals("ح") || ArabicLetters[number].equals("غ") || ArabicLetters[number].equals("خ") )
                {

                }
            }
        });

        //move to activity 2
        move=findViewById(R.id.button);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(MainActivity.this,MainActivity2.class);
               // startActivity(intent);
            }
        });
    }
}