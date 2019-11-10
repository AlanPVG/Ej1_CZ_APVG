package com.example.ej1_chinesezodiac_apvg;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


public class Activity2 extends AppCompatActivity {

    int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();

        String age = intent.getStringExtra(MainActivity.EXTRA_YEARS);//Edad

        int remainder = intent.getIntExtra(MainActivity.EXTRA_REMAINDER,0);

        TextView textView1 = findViewById(R.id.Age);

        ImageView imageZod = findViewById(R.id.zodiack);

        textView1.setText(age);

        id = operaRemainder(remainder);

        imageZod.setImageResource(id);


    }

    public int operaRemainder(int remainder){
        switch (remainder)
        {
            case (0): //Monkey
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/mono", null, null);
                break;
            case (1): //Rooster
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/gallo", null, null);
                break;
            case (2): //Dog
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/perro", null, null);
                break;
            case (3): //Pig
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/cerdo", null, null);
                break;
            case (4): //Rat
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/rata", null, null);
                break;
            case (5): //Ox
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/buey", null, null);
                break;
            case (6): //Tiger
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/tigre", null, null);
                break;
            case (7): //Rabbit
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/conejo", null, null);
                break;
            case (8): //Dragon
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/dragon", null, null);
                break;
            case (9): //Snake
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/serpiente", null, null);
                break;
            case (10): //Horse
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/caballo", null, null);
                break;
            case (11): //Ram
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/cabra", null, null);
                break;
        }
        return id;
    }

}
