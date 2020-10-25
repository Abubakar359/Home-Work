package com.example.mchomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup RadioGroupNo1, RadioGroupNo2;
    RadioButton RadioButton1, RadioButton2;
    CheckBox CheckBox1, CheckBox2, CheckBox3, CheckBox4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowData(View view) {

        RadioGroupNo1 = findViewById(R.id.RadioGroupNo1);
        RadioGroupNo2 = findViewById(R.id.RadioGroupNo2);

        int RG1_Checked = RadioGroupNo1.getCheckedRadioButtonId();
        RadioButton1 = findViewById(RG1_Checked);

        int RG2_Checked = RadioGroupNo2.getCheckedRadioButtonId();
        RadioButton2 = findViewById(RG2_Checked);

        CheckBox1 = findViewById(R.id.CheckBox1);
        CheckBox2 = findViewById(R.id.CheckBox2);
        CheckBox3 = findViewById(R.id.CheckBox3);
        CheckBox4 = findViewById(R.id.CheckBox4);

        String RadioText = RadioButton1.getText().toString();
        RadioText += "," + RadioButton2.getText().toString();

        if (CheckBox1.isChecked()) {
            RadioText += "," + CheckBox1.getText().toString();
        }
        if (CheckBox2.isChecked()) {
            RadioText += "," + CheckBox2.getText().toString();
        }
        if (CheckBox3.isChecked()) {
            RadioText += "," + CheckBox3.getText().toString();
        }
        if (CheckBox4.isChecked()) {
            RadioText += "," + CheckBox4.getText().toString();
        }

        RadioText += " ARE SELECTED";

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Result_string", RadioText);
        startActivity(intent);
    }
}
