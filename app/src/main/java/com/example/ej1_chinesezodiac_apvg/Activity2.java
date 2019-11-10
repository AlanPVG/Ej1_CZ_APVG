package com.example.ej1_chinesezodiac_apvg;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();

        int id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/buey", null, null);

        String age = intent.getStringExtra(MainActivity.EXTRA_YEARS);//Edad

        TextView textView1 = findViewById(R.id.Age);

        ImageView imageZod = findViewById(R.id.zodiack);

        textView1.setText(age);

        imageZod.setImageResource(id);


    }

}
