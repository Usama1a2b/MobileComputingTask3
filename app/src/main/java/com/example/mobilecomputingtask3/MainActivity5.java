package com.example.mobilecomputingtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {

    Button move2,move3,move4,move5,move6;
    TextView text,text2;
    String [] ArabicLetters={"ا","ب","ت","ث","ج","ح","خ","د","ذ","ر","ز","س","ش","ص","ض","ط","ظ","ع","غ","ف","ق","ك","ل","م","ن","ه","و","ي"};
    Random dice=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        int e=GlobalVariable.glob;
        String s=String.valueOf(e);
        text2=findViewById(R.id.textView);
        text2.setText(s);

        //random number generated
        int number= dice.nextInt(28);
        text=findViewById(R.id.textView3);

        //random alphabet show in text field
        text.setText(ArabicLetters[number]);

        //Throat section
        move2=findViewById(R.id.button23);
        move2.setOnClickListener(new View.OnClickListener() {

            //throat section
            @Override
            public void onClick(View v) {
                Intent intent;
                if(ArabicLetters[number].equals("ا") || ArabicLetters[number].equals("ه") || ArabicLetters[number].equals("ع") || ArabicLetters[number].equals("ح" )|| ArabicLetters[number].equals("غ") || ArabicLetters[number].equals("خ") )
                {
                    intent = new Intent(MainActivity5.this, MainActivity2.class);
                    intent.putExtra("keyname",ArabicLetters[number]);
                    startActivity(intent);
                }
                else{
                    intent = new Intent(MainActivity5.this, MainActivity5.class);
                    startActivity(intent);
                }

            }
        });



        //Tongue section
        move5=findViewById(R.id.button21);
        move5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ArabicLetters[number].equals("ض") || ArabicLetters[number].equals("ل")  || ArabicLetters[number].equals("ر") || ArabicLetters[number].equals("ت") || ArabicLetters[number].equals("د") || ArabicLetters[number].equals("ط") || ArabicLetters[number].equals("ظ") || ArabicLetters[number].equals("ذ") || ArabicLetters[number].equals("ث") || ArabicLetters[number].equals("ص") || ArabicLetters[number].equals("ز") || ArabicLetters[number].equals("س") )
                {
                    Intent intent2=new Intent(MainActivity5.this,MainActivity3.class);
                    intent2.putExtra("keyname2",ArabicLetters[number]);
                    startActivity(intent2);

                }
                else {
                    Intent intent = new Intent(MainActivity5.this, MainActivity5.class);
                    startActivity(intent);
                }
            }
        });


        //Nose section
        move3=findViewById(R.id.button25);
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ArabicLetters[number].equals("م")||ArabicLetters[number].equals("ن") )
                {
                    GlobalVariable.glob++;
                    Intent intent = new Intent(MainActivity5.this, MainActivity5.class);
                    startActivity(intent);

                }
                else {
                    Intent intent = new Intent(MainActivity5.this, MainActivity5.class);
                    startActivity(intent);
                }
            }
        });

        //Lip section
        move4=findViewById(R.id.button26);
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ArabicLetters[number].equals("ف") || ArabicLetters[number].equals("ب") || ArabicLetters[number].equals("و") )
                {
                    Intent intent2=new Intent(MainActivity5.this,MainActivity6.class);
                    intent2.putExtra("keyname2",ArabicLetters[number]);
                    startActivity(intent2);

                }
                else {
                    Intent intent = new Intent(MainActivity5.this, MainActivity5.class);
                    startActivity(intent);
                }
            }
        });

        //Mouth section
        move6=findViewById(R.id.button22);
        move6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ArabicLetters[number].equals("ق") || ArabicLetters[number].equals("ك") || ArabicLetters[number].equals("ج") || ArabicLetters[number].equals("ش") || ArabicLetters[number].equals("ي") )
                {
                    Intent intent2=new Intent(MainActivity5.this,MainActivity4.class);
                    intent2.putExtra("keyname2",ArabicLetters[number]);
                    startActivity(intent2);

                }
                else {
                    Intent intent = new Intent(MainActivity5.this, MainActivity5.class);
                    startActivity(intent);
                }
            }
        });

    }
}
