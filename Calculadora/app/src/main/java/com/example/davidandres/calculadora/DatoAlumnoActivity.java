package com.example.davidandres.calculadora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DatoAlumnoActivity extends Activity{

    TextView notaPromedio;
    TextView estadoAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dato_alumno);

        Bundle datos = getIntent().getExtras();
        Double promed = datos.getDouble("resultado");
        //String v = datos.getString("vacio");

        if (promed > 0 && promed < 4){
            String p = Double.toString(promed);
            notaPromedio = (TextView) findViewById(R.id.textViewNotaPromedio);
            estadoAlumnos = (TextView) findViewById(R.id.estadoAlumno);
            notaPromedio.setText(p);
            estadoAlumnos.setText("No Califica");
        }else if (promed > 4){
            String p = Double.toString(promed);
            notaPromedio = (TextView) findViewById(R.id.textViewNotaPromedio);
            estadoAlumnos = (TextView) findViewById(R.id.estadoAlumno);
            notaPromedio.setText(p);
            estadoAlumnos.setText("Aprobado");
        }else if(promed == 0){
            notaPromedio = (TextView) findViewById(R.id.textViewNotaPromedio);
            estadoAlumnos = (TextView) findViewById(R.id.estadoAlumno);
            notaPromedio.setText("0");
            estadoAlumnos.setText("Cero");
        }else{
            finish();
        }
    }
}
