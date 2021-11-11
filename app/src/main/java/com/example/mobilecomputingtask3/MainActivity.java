

package com.example.mobilecomputingtask3;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button move,move2,move3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //repository
        move=findViewById(R.id.button);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Uri uri = Uri.parse("https://github.com/Usama1a2b/MobileComputingTask3.git"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        move2=findViewById(R.id.button2);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Uri uri = Uri.parse("https://drive.google.com/file/d/1h2x4AVhCp1oFDOX4yT7axQCdh7Hqdmid/view?usp=sharing"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        move3=findViewById(R.id.button3);
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent intent=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
            }
        });


    }
}