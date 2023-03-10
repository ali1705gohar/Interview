package com.example.interview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class tough_questions extends AppCompatActivity {

    Button btnnext,btnprevious,btnanswer;
    TextView xx1,yy1;
int counter=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tough_questions);

        btnnext=findViewById(R.id.btn_next);
        btnprevious=findViewById(R.id.btn_prev);
        btnanswer=findViewById(R.id.btn_ans);
        xx1=findViewById(R.id.xx);
        yy1=findViewById(R.id.YY);
        TextView question1=findViewById(R.id.question_txt);
        TextView answer1=findViewById(R.id.ans_txt);
        String[] tough =getResources().getStringArray(R.array.ques_tough);



    }
}