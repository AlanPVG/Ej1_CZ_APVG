package com.example.ej1_chinesezodiac_apvg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Nombre,Fecha_Nacimiento,No_Cuenta,Correo;
    Button btnCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.Nombre);
        Fecha_Nacimiento = findViewById(R.id.Fecha_Nacimiento);
        No_Cuenta = findViewById(R.id.No_Cuenta);
        Correo = findViewById(R.id.Correo);
        btnCheck = findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Fecha_Nacimiento.length()!=0)
                {
                    Toast.makeText(MainActivity.this, "Good, good", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Gonnad need a birth date, m8", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
