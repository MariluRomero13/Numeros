package com.example.numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4,btn5, btnreiniciar;
    TextView tvrol, tvsuma, tvmostrar;
    int numero = 0;
    int suma = 0;
    int contador = 0;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btnreiniciar = findViewById(R.id.reiniciar);
        tvrol = findViewById(R.id.tvrol);
        tvsuma = findViewById(R.id.tvsuma);
        tvmostrar = findViewById(R.id.tvmostrar);



        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1:
                        numero = r.nextInt(10) + 1;
                        tvmostrar.setText(String.valueOf(numero));
                        suma = suma + numero;
                        tvsuma.setText(String.valueOf(suma));
                        btn1.setEnabled(false);
                        contador++;
                        break;
                    case R.id.btn2:
                        numero = r.nextInt(10) + 1;
                        tvmostrar.setText(String.valueOf(numero));
                        suma = suma + numero;
                        tvsuma.setText(String.valueOf(suma));
                        btn2.setEnabled(false);
                        contador++;
                        break;
                    case R.id.btn3:
                        numero = r.nextInt(10) + 1;
                        tvmostrar.setText(String.valueOf(numero));
                        suma = suma + numero;
                        tvsuma.setText(String.valueOf(suma));
                        btn3.setEnabled(false);
                        contador++;
                        break;
                    case R.id.btn4:
                        numero = r.nextInt(10) + 1;
                        tvmostrar.setText(String.valueOf(numero));
                        suma = suma + numero;
                        tvsuma.setText(String.valueOf(suma));
                        btn4.setEnabled(false);
                        contador++;
                        break;
                    case R.id.btn5:
                        numero = r.nextInt(10) + 1;
                        tvmostrar.setText(String.valueOf(numero));
                        suma = suma + numero;
                        tvsuma.setText(String.valueOf(suma));
                        btn5.setEnabled(false);
                        contador++;
                        break;

                    case R.id.reiniciar:
                        suma = 0;
                        numero = 0;
                        tvrol.setText("");
                        tvsuma.setText("0");
                        tvmostrar.setText("0");
                        habilitar();
                        contador = 0;
                        break;
                }
                ganador();


            }
        };

        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
        btn4.setOnClickListener(click);
        btn5.setOnClickListener(click);
        btnreiniciar.setOnClickListener(click);

    }


    public void ganador()
    {
        if (contador == 5)
        {
            if (suma <= 21)
            {
                tvrol.setText("GANASTE D:");
                btnreiniciar.setEnabled(true);
                deshabilitar();

            }
        }

        if(suma > 21)
        {
            tvrol.setText("PERDISTE D:");
            btnreiniciar.setEnabled(true);
            deshabilitar();
        }
    }


    public void habilitar()
    {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
    }

    public void deshabilitar()
    {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
    }



}
