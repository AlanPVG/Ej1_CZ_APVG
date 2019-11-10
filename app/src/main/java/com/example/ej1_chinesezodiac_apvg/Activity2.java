package com.example.ej1_chinesezodiac_apvg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();

        String age = intent.getStringExtra(MainActivity.EXTRA_YEARS);//Edad

        TextView textView1 = findViewById(R.id.Age);

        textView1.setText(age);
        //Toast.makeText(Activity2.this,age , Toast.LENGTH_SHORT).show();

    }

}
