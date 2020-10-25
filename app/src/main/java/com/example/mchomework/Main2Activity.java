package com.example.mchomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.ResultBox);
        Intent intent=getIntent();
        String Result_string=intent.getStringExtra("Result_string");
        textView.setText(Result_string);
    }
}
