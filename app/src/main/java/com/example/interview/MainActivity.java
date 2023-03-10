package com.example.interview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_tough,btn_easy,btn_rate,btn_more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tough =findViewById(R.id.tough_questions);
        btn_easy= findViewById(R.id.easy_questions);



        btn_tough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,tough_questions.class);
                startActivity(i);
            }
        });

        btn_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,easy_questions.class);
                startActivity(i);
            }
        });
    }
}