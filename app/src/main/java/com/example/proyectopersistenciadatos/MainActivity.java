package com.example.proyectopersistenciadatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView num;
    Button botonIncrementar, botonDecrementar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num=findViewById(R.id.textView);
        botonIncrementar=findViewById((R.id.button));
        botonDecrementar=findViewById((R.id.button2));


        botonIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(String.valueOf(++valor));

            }
        });
        buttonReducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(String.valueOf(--valor));
            }
        });


    }
    protected void onResume(){
        super.onResume();
        SharedPreferences datos = PreferenceManager.getDefaultSharedPreferences();
        contador=datos.getInt();
        resultado.setText(Integer.toString(contador));
    }
}