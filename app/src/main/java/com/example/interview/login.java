package com.example.interview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         Button btn=findViewById(R.id.login);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(login.this,MainActivity.class);
                 startActivity(i);
             }
         });



    }
}