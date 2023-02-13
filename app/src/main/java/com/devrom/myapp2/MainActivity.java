package com.devrom.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText quimica;
    private EditText fisica;
    private EditText matemaicas;
    private TextView promedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.quimica = (EditText)findViewById(R.id.quimica);
        this.fisica = (EditText)findViewById(R.id.fisica);
        this.matemaicas = (EditText)findViewById(R.id.matematicas);
        this.promedio = (TextView) findViewById(R.id.rPromedio);
    }

    public void Promela(View view){
        String valor1 = this.quimica.getText().toString();
        String valor2 = this.fisica.getText().toString();
        String valor3 = this.matemaicas.getText().toString();

        int quimica = Integer.parseInt(valor1);
        int fisica = Integer.parseInt(valor2);
        int matematicas = Integer.parseInt(valor3);

        int promedio = (quimica + fisica + matematicas) / 3;

        if(promedio >= 6 && promedio <= 10){
            this.promedio.setText("Aprobado con promedio de " + promedio);
        }
        else if (promedio < 6 && promedio >= 0){
            this.promedio.setText("Reprobado con nota de " + promedio);
        }
        else {
            this.promedio.setText("Error: Revise las notas ingresadas");
        }
    }
}