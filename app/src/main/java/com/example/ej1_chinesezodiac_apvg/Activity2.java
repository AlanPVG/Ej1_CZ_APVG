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

        int yearOfBirth = intent.getIntExtra(MainActivity.EXTRA_YEAR_BIRTH,0);

        TextView textView1 = findViewById(R.id.Age);

        TextView textView2 = findViewById(R.id.zodiacIdentifier);

        ImageView imageZod = findViewById(R.id.zodiack);

        textView1.setText(age);

        id = operaRemainder(remainder,yearOfBirth, textView2);

        imageZod.setImageResource(id);


    }

    public int operaRemainder(int remainder,int yearOfBirth, TextView textView){
        String message = getString(R.string.zodiacLegend);
        switch (remainder)
        {
            case (0): //Mono
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/mono", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod) + " " + getString(R.string.zodiacMonkey));
                break;
            case (1): //Gallo
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/gallo", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod)+ " " + getString(R.string.zodiacRooster));
                break;
            case (2): //Perro
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/perro", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod) + " " + getString(R.string.zodiacDog));
                break;
            case (3): //Cerdo
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/cerdo", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod) + " " + getString(R.string.zodiacPig));
                break;
            case (4): //Rata
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/rata", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.laZod) + " " + getString(R.string.zodiacRat));
                break;
            case (5): //Buey
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/buey", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod) + " " + getString(R.string.zodiacOx));
                break;
            case (6): //Tigre
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/tigre", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod) + " " + getString(R.string.zodiacTiger));
                break;
            case (7): //Conejo
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/conejo", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod) + " " + getString(R.string.zodiacRabbit));
                break;
            case (8): //Dragon
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/dragon", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod) + " " + getString(R.string.zodiacDragon));
                break;
            case (9): //Serpiente
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/serpiente", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.laZod) + " " + getString(R.string.zodiacSnake));
                break;
            case (10): //Caballo
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/caballo", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.elZod) + " " + getString(R.string.zodiacHorse));
                break;
            case (11): //Cabra
                id = getResources().getIdentifier("com.example.ej1_chinesezodiac_apvg:drawable/cabra", null, null);
                textView.setText(String.valueOf(yearOfBirth) + " " + message + " " + getString(R.string.laZod) + " " + getString(R.string.zodiacRam));
                break;
        }
        return id;
    }

}
