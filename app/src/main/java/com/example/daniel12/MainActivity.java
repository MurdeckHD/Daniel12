package com.example.daniel12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public EditText Numero1;
    public EditText Numero2;
    public Button btnSumar;
    public Button btnRestar;
    public Button btnMultiplicar;
    public Button btnDividir;
    public TextView ResuldadoTotal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Numero1 = (EditText)findViewById(R.id.Numero1);
        Numero2 = (EditText)findViewById(R.id.Numero2);
        ResuldadoTotal = (TextView)findViewById(R.id.ResultadoTotal);

        btnSumar = (Button)findViewById(R.id.Sumar);





        /*btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int valor1 = Integer.parseInt(Numero1.getText().toString());
                int valor2 = Integer.parseInt(Numero2.getText().toString());
                int x = valor1 + valor2;
                ResuldadoTotal.setText(x+"");
            }
        });*/


        btnRestar = (Button)findViewById(R.id.Restar);




        /*btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(Numero1.getText().toString());
                int valor2 = Integer.parseInt(Numero2.getText().toString());
                int x = valor1 + valor2;
                ResuldadoTotal.setText(x+"");
            }
        });*/



        btnDividir = (Button)findViewById(R.id.Dividir);



        /*btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/


        btnMultiplicar = (Button)findViewById(R.id.Multiplicar);


        /*btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/


        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(Numero1.getText().toString());
        int num2 = Integer.parseInt(Numero2.getText().toString());
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multipliacion = num1*num2;
        int division = num1/num2;


        switch (v.getId()) {
            case R.id.Sumar:
                ResuldadoTotal.setText("El resultado es" + suma);
                break;
            case R.id.Restar:
                ResuldadoTotal.setText("El Resultado es" + resta);

            case R.id.Multiplicar:
                ResuldadoTotal.setText("El Resultado es" + multipliacion);
               break;

            case R.id.Dividir:
             ResuldadoTotal.setText("El Resultado es " + division);
                break;


            default:
                ResuldadoTotal.setText("Ingrese Solamente Nuemeros" );
                break;


    }
}
}
