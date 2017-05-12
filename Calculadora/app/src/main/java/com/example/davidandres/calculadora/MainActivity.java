package com.example.davidandres.calculadora;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ingresoPrimerNumero, ingresoPrimerNumero15, ingresoPrimerNumero20, ingresoPrimerNumero25, ingresoPrimerNumero30;
    EditText ingresoSegundoNumero, ingresoSegundoNumero15, ingresoSegundoNumero20, ingresoSegundoNumero25, ingresoSegundoNumero30;
    EditText resultado10, resultado15, resultado20, resultado25, resultado30, promedio;
    Button botonBorraNota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresoPrimerNumero = (EditText) findViewById(R.id.editTextIngreso10);
        ingresoSegundoNumero = (EditText) findViewById(R.id.editTextIngresoDecimal);
        resultado10 = (EditText) findViewById(R.id.editTextResul10);

        botonBorraNota = (Button) findViewById(R.id.buttonBorrarTodo);

        ingresoPrimerNumero15 = (EditText) findViewById(R.id.editTextIngreso15);
        ingresoSegundoNumero15 = (EditText) findViewById(R.id.editTextIngresoDecimal15);
        resultado15 = (EditText) findViewById(R.id.editTextResul15);

        ingresoPrimerNumero20 = (EditText) findViewById(R.id.editTextIngreso20);
        ingresoSegundoNumero20 = (EditText) findViewById(R.id.editTextIngresoDecimal20);
        resultado20 = (EditText) findViewById(R.id.editTextResul20);

        ingresoPrimerNumero25 = (EditText) findViewById(R.id.editTextIngreso25);
        ingresoSegundoNumero25 = (EditText) findViewById(R.id.editTextIngresoDecimal25);
        resultado25 = (EditText) findViewById(R.id.editTextResul25);

        ingresoPrimerNumero30 = (EditText) findViewById(R.id.editTextIngreso30);
        ingresoSegundoNumero30 = (EditText) findViewById(R.id.editTextIngresoDecimal30);
        resultado30 = (EditText) findViewById(R.id.editTextResul30);

        promedio = (EditText) findViewById(R.id.editTextPromedio);

        //     ---------- 10% ----------
        resultado10.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String mostrarPrimer = ingresoPrimerNumero.getText().toString();
                //Log.d("mostrarPrimero1",mostrarPrimer);
                if(!mostrarPrimer.isEmpty()) {
                    int mostrarPrimero = Integer.parseInt(mostrarPrimer);
                    if (mostrarPrimero == 7) {
                        double ingresoTotal = mostrarPrimero * 0.1;
                        resultado10.setText(Double.toString(ingresoTotal));

                    } else {
                        String mostrarSegund = ingresoSegundoNumero.getText().toString();
                        //Log.d("mostrarSegund",mostrarSegund);
                            if(!mostrarSegund.isEmpty() ){
                                int mostrarSegundo = Integer.parseInt(mostrarSegund);
                                double sumaNumeros = mostrarPrimero + (mostrarSegundo * 0.1);
                                double ingresoTotal = sumaNumeros * 0.10;
                                resultado10.setText(Double.toString(ingresoTotal));
                            }else{
                                double sumaNumeros = mostrarPrimero + 0;
                                double ingresoTotal = sumaNumeros * 0.10;
                                resultado10.setText(Double.toString(ingresoTotal));
                            }
                    }
                } else {
                    alertDialogBasico();
                }
            }
        });



        //     ---------- 15% ----------
        resultado15.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String mostrarPrimer15 = ingresoPrimerNumero15.getText().toString();
                if(!mostrarPrimer15.isEmpty()){
                    int mostrarPrimero15 = Integer.parseInt(mostrarPrimer15);
                    if (mostrarPrimero15 == 7) {
                        double ingresoTotal15 = mostrarPrimero15 * 0.15;
                        resultado15.setText(Double.toString(ingresoTotal15));
                        ingresoSegundoNumero15.setText("0");
                    } else {
                        String mostrarSegund15 = ingresoSegundoNumero15.getText().toString();
                        //Log.d("mostrarSegund",mostrarSegund);
                        if(!mostrarSegund15.isEmpty() ){
                            int mostrarSegundo15 = Integer.parseInt(mostrarSegund15);
                            double sumaNumeros15 = mostrarPrimero15 + (mostrarSegundo15 * 0.1);
                            double ingresoTotal15 = sumaNumeros15 * 0.15;
                            resultado15.setText(Double.toString(ingresoTotal15));
                        }else{
                            double sumaNumeros15 = mostrarPrimero15 + 0;
                            double ingresoTotal15 = sumaNumeros15 * 0.15;
                            resultado15.setText(Double.toString(ingresoTotal15));
                        }
                    }
                } else {
                    alertDialogBasico();
                }
            }
        });

        //     ---------- 20% ----------
        resultado20.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String mostrarPrimer20 = ingresoPrimerNumero20.getText().toString();
                if(!mostrarPrimer20.isEmpty()){
                    int mostrarPrimero20 = Integer.parseInt(mostrarPrimer20);
                    if (mostrarPrimero20 == 7) {
                        double ingresoTotal20 = mostrarPrimero20 * 0.20;
                        resultado20.setText(Double.toString(ingresoTotal20));
                        ingresoSegundoNumero20.setText("0");
                    } else {
                        String mostrarSegund20 = ingresoSegundoNumero20.getText().toString();
                        //Log.d("mostrarSegund",mostrarSegund);
                        if(!mostrarSegund20.isEmpty() ){
                            int mostrarSegundo20 = Integer.parseInt(mostrarSegund20);
                            double sumaNumeros20 = mostrarPrimero20 + (mostrarSegundo20 * 0.1);
                            double ingresoTotal20 = sumaNumeros20 * 0.20;
                            resultado20.setText(Double.toString(ingresoTotal20));
                        }else{
                            double sumaNumeros20 = mostrarPrimero20 + 0;
                            double ingresoTotal20 = sumaNumeros20 * 0.20;
                            resultado20.setText(Double.toString(ingresoTotal20));
                        }
                    }
                } else {
                    alertDialogBasico();
                }
            }
        });

        //     ---------- 25% ----------
        resultado25.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String mostrarPrimer25 = ingresoPrimerNumero25.getText().toString();
                if(!mostrarPrimer25.isEmpty()){
                    int mostrarPrimero25 = Integer.parseInt(mostrarPrimer25);
                    if (mostrarPrimero25 == 7) {
                        double ingresoTotal25 = mostrarPrimero25 * 0.25;
                        resultado25.setText(Double.toString(ingresoTotal25));
                        ingresoSegundoNumero25.setText("0");
                    } else {
                        String mostrarSegund25 = ingresoSegundoNumero25.getText().toString();
                        //Log.d("mostrarSegund",mostrarSegund);
                        if(!mostrarSegund25.isEmpty() ){
                            int mostrarSegundo25 = Integer.parseInt(mostrarSegund25);
                            double sumaNumeros25 = mostrarPrimero25 + (mostrarSegundo25 * 0.1);
                            double ingresoTotal25 = sumaNumeros25 * 0.25;
                            resultado25.setText(Double.toString(ingresoTotal25));
                        }else{
                            double sumaNumeros25 = mostrarPrimero25 + 0;
                            double ingresoTotal25 = sumaNumeros25 * 0.25;
                            resultado25.setText(Double.toString(ingresoTotal25));
                        }
                    }
                } else {
                    alertDialogBasico();
                }

            }
        });

        //     ---------- 30% ----------
        resultado30.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String mostrarPrimer30 = ingresoPrimerNumero30.getText().toString();
                if (!mostrarPrimer30.isEmpty()){
                    int mostrarPrimero30 = Integer.parseInt(mostrarPrimer30);
                    if (mostrarPrimero30 == 7) {
                        double ingresoTotal30 = mostrarPrimero30 * 0.1;
                        resultado30.setText(Double.toString(ingresoTotal30));
                        ingresoSegundoNumero30.setText("0");
                    } else {
                        String mostrarSegund30 = ingresoSegundoNumero30.getText().toString();
                        //Log.d("mostrarSegund",mostrarSegund);
                        if(!mostrarSegund30.isEmpty() ){
                            int mostrarSegundo30 = Integer.parseInt(mostrarSegund30);
                            double sumaNumeros30 = mostrarPrimero30 + (mostrarSegundo30 * 0.1);
                            double ingresoTotal30 = sumaNumeros30 * 0.30;
                            resultado30.setText(Double.toString(ingresoTotal30));
                        }else{
                            double sumaNumeros30 = mostrarPrimero30 + 0;
                            double ingresoTotal30 = sumaNumeros30 * 0.30;
                            resultado30.setText(Double.toString(ingresoTotal30));
                        }
                    }
                } else {
                    alertDialogBasico();
                }
            }
        });

        //     ---------- Promedios ----------
        promedio.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                int mostrarPrimero = Integer.parseInt(ingresoPrimerNumero.getText().toString());
                int mostrarPrimero15 =  Integer.parseInt(ingresoPrimerNumero15.getText().toString());
                int mostrarPrimero20 =  Integer.parseInt(ingresoPrimerNumero20.getText().toString());
                int mostrarPrimero25 =  Integer.parseInt(ingresoPrimerNumero25.getText().toString());
                int mostrarPrimero30 =  Integer.parseInt(ingresoPrimerNumero30.getText().toString());

                if (mostrarPrimero > 1 || mostrarPrimero15 > 1 || mostrarPrimero20 > 1 || mostrarPrimero25 > 1|| mostrarPrimero30 > 1){

                    String ingresoTotal_ = resultado10.getText().toString();
                    Log.d("ingresoTotal_",ingresoTotal_);
                    String ingresoTotal15_ = resultado15.getText().toString();
                    Log.d("ingresoTotal_",ingresoTotal15_);
                    String ingresoTotal20_ = resultado20.getText().toString();
                    Log.d("ingresoTotal_",ingresoTotal20_);
                    String ingresoTotal25_ = resultado25.getText().toString();
                    Log.d("ingresoTotal_",ingresoTotal25_);
                    String ingresoTotal30_ = resultado30.getText().toString();
                    Log.d("ingresoTotal_",ingresoTotal30_);

                    Double ingresoTotal =Double.parseDouble(ingresoTotal_);
                    Double ingresoTotal15 = Double.parseDouble(ingresoTotal15_);
                    Double ingresoTotal20 = Double.parseDouble(ingresoTotal20_);
                    Double ingresoTotal25 = Double.parseDouble(ingresoTotal25_);
                    Double ingresoTotal30 = Double.parseDouble(ingresoTotal30_);

                    /*int mostrarSegundo = Integer.parseInt(ingresoSegundoNumero.getText().toString());
                    double sumaNumeros = mostrarPrimero + (mostrarSegundo*0.1);
                    double ingresoTotal = sumaNumeros * 0.1;

                    int mostrarSegundo15 = Integer.parseInt(ingresoSegundoNumero15.getText().toString());
                    double sumaNumeros15 = mostrarPrimero15 + (mostrarSegundo15*0.1);
                    double ingresoTotal15 = sumaNumeros15 * 0.15;

                    int mostrarSegundo20 = Integer.parseInt(ingresoSegundoNumero20.getText().toString());
                    double sumaNumeros20 = mostrarPrimero20 + (mostrarSegundo20*0.1);
                    double ingresoTotal20 = sumaNumeros20 * 0.20;

                    int mostrarSegundo25 = Integer.parseInt(ingresoSegundoNumero25.getText().toString());
                    double sumaNumeros25 = mostrarPrimero25 + (mostrarSegundo25*0.1);
                    double ingresoTotal25 = sumaNumeros25 * 0.25;

                    int mostrarSegundo30 = Integer.parseInt(ingresoSegundoNumero30.getText().toString());
                    double sumaNumeros30 = mostrarPrimero30 + (mostrarSegundo30*0.1);
                    double ingresoTotal30 = sumaNumeros30 * 0.30;*/

                    String promedioNota = Double.toString(ingresoTotal+ingresoTotal15+ingresoTotal20+ingresoTotal25+ingresoTotal30);
                    promedio.setText(promedioNota);
                }
            }
        });

        botonBorraNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresoPrimerNumero.setText("");
                ingresoSegundoNumero.setText("");
                resultado10.setText("");
                ingresoPrimerNumero15.setText("");
                ingresoSegundoNumero15.setText("");
                resultado15.setText("");
                ingresoPrimerNumero20.setText("");
                ingresoSegundoNumero20.setText("");
                resultado20.setText("");
                ingresoPrimerNumero25.setText("");
                ingresoSegundoNumero25.setText("");
                resultado25.setText("");
                ingresoPrimerNumero30.setText("");
                ingresoSegundoNumero30.setText("");
                resultado30.setText("");
                promedio.setText("");
            }
        });

    }

    public void colocaCero(View view){

    }

    public void llevaPromedio(View view){

        String resultadoPromedi = promedio.getText().toString();

            if(!resultadoPromedi.isEmpty()){
                Double resultadoPromedio = Double.parseDouble(resultadoPromedi);
                Intent r = new Intent(this,DatoAlumnoActivity.class);
                r.putExtra("resultado",resultadoPromedio);
                startActivity(r);
            }else{
                Intent r = new Intent(this,DatoAlumnoActivity.class);
                r.putExtra("vacio","vacio");
                startActivity(r);
            }
    }

    public void alertDialogBasico(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Observe")
                .setTitle("Ingresa una Nota");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ingresoPrimerNumero.requestFocus();
            }
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast toast1 = Toast.makeText(getApplicationContext(),
                                "Estas saliendo de la aplicacion", Toast.LENGTH_LONG);

                toast1.show();
                finish();
            }
        });
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
