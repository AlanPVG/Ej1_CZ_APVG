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

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_YEARS = "com.example.ej1_chinesezodiac_apvg.EXTRA_YEARS";
    public static final String  EXTRA_REMAINDER = "com.example.ej1_chinesezodiac_apvg.EXTRA_REMAINDER";
    public static final String  EXTRA_YEAR_BIRTH = "com.example.ej1_chinesezodiac_apvg.EXTRA_YEAR_BIRTH";
    EditText Nombre,Fecha_Nacimiento,No_Cuenta,Correo;
    Button btnCheck,btnCredits;
    int diffYears = 0;
    int remainder = 0;
    int yearOfBirth = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.Nombre);
        Fecha_Nacimiento = findViewById(R.id.Fecha_Nacimiento);
        No_Cuenta = findViewById(R.id.No_Cuenta);
        Correo = findViewById(R.id.Correo);
        btnCheck = findViewById(R.id.btnCheck);
        btnCredits = findViewById(R.id.creditsButton);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Fecha_Nacimiento.length()!=0 && Nombre.length()!=0 && No_Cuenta.length()!=0 && Correo.length()!=0)
                {
                    //Fecha actual
                    Date date = new Date();
                    //Formateador de fecha
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    //Fecha actual en string
                    String currentDate = formatter.format(date);
                    //Fecha de nacimiento en string
                    String n = Fecha_Nacimiento.getText().toString();


                    try{
                        Date bDate = formatter.parse(currentDate);
                        Date aDate = formatter.parse(n);
                        diffYears = getDiffYears(aDate,bDate);
                        Calendar birthDate = getCalendar(aDate);
                        remainder = birthDate.get(YEAR)%12;
                        yearOfBirth = birthDate.get(YEAR);
                        openActivity2();
                    }
                    catch (ParseException e) {
                    e.printStackTrace();
                    }

                }
                else
                {

                    Toast.makeText(MainActivity.this, getString(R.string.toastIncompleteForm), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    private int getDiffYears(Date first, Date last){
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);

        if ((a.get(MONTH) > b.get(MONTH))||(a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE)))
        {
            diff--;
        }
        return diff;
    }

    public static Calendar getCalendar(Date date){
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    public void openActivity2(){
        String years = String.valueOf(diffYears);
        int auxRemainder = remainder;
        int auxYear = yearOfBirth;
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_YEARS,years);
        intent.putExtra(EXTRA_REMAINDER,auxRemainder);
        intent.putExtra(EXTRA_YEAR_BIRTH, auxYear);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Activity3_Credits.class);
        startActivity(intent);
    }
}
