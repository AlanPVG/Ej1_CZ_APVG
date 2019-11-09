package com.example.ej1_chinesezodiac_apvg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;
import java.util.Date;
import java.time.LocalDateTime;

public class Activity2 extends AppCompatActivity {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnReturn = findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openActivity1();
            }
        });




    }

    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
