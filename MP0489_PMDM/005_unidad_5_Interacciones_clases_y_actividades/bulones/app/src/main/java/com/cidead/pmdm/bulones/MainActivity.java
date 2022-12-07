package com.cidead.pmdm.bulones;

import static java.lang.Math.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private float diametroBulon=0f;
    private float diametroPerforacion=0f;
    private float relacion=0 ;
    private float l=0;
    private int n=0;
    private RadioButton rBtn16;
    private RadioButton rBtn20;
    private RadioButton rBtn25;
    private RadioButton rBtn32;
    private EditText inputDiametroExcavacion;
    private EditText inputRealacioanAC;
    private TextView resultado;
    private TextView total;
    private EditText longitud;
    private EditText nBulones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rBtn16 = (RadioButton) findViewById(R.id.rBtn16);
        rBtn20 = (RadioButton) findViewById(R.id.rBtn20);
        rBtn25 = (RadioButton) findViewById(R.id.rBtn25);
        rBtn32 = (RadioButton) findViewById(R.id.rBtn32);
        resultado=(TextView) findViewById(R.id.textViewkgCemento);
        total=(TextView) findViewById(R.id.textViewTotalCemento);
        inputRealacioanAC=(EditText) findViewById(R.id.editTextNumberDecimal);
        inputDiametroExcavacion=(EditText) findViewById((R.id.editTextNumberPerforacion));
        longitud=(EditText) findViewById(R.id.editTextNumber);
        nBulones=(EditText)findViewById(R.id.editTextNumberNBulones);


    }

    public void calcularVolumen(View view) {
        int id = view.getId();


        if (inputRealacioanAC.getText().toString()=="") {
            Toast.makeText(this, "Introduce relacion agua cemento", Toast.LENGTH_SHORT).show();
        } else {
            relacion = Float.parseFloat(inputRealacioanAC.getText().toString());

        }
        if (inputDiametroExcavacion.getText().toString()=="") {
            Toast.makeText(this, "Introduce diametro de perforación", Toast.LENGTH_SHORT).show();
        } else {
            diametroPerforacion = Float.parseFloat(inputDiametroExcavacion.getText().toString());
        }
        if (longitud.getText().toString()=="") {
            Toast.makeText(this, "Introduce Longitud de bulones", Toast.LENGTH_SHORT).show();
        } else {
            l = Float.parseFloat(longitud.getText().toString());
        }
        if (nBulones.getText().toString()=="") {
            Toast.makeText(this, "Introduce relacion agua cemento", Toast.LENGTH_SHORT).show();
        } else {
            n = Integer.parseInt(nBulones.getText().toString());
        }
        if(relacion>0 && l>0 &&n>0 && diametroPerforacion>0) {
            float sExc = (float) (PI * (diametroPerforacion / 2000f) * (diametroPerforacion / 2000f));
            System.out.println("Superficie de excavacion :" + sExc);

            float sBarra = (float) (PI * (diametroBulon / 2000f) * (diametroBulon / 2000f));
            System.out.println("Superficie barra :" + sBarra);
            float volumenLechada = (float) (sExc - sBarra) * l;
            System.out.println("Volumen de lechada " + volumenLechada);
            float kgCemento = (float) (1000f * (volumenLechada / relacion));
            System.out.println(kgCemento);

            switch (id) {
                case R.id.rBtn16:
                    diametroBulon = 16;
                    break;
                case R.id.rBtn20:
                    diametroBulon = 20;
                    break;
                case R.id.rBtn25:
                    diametroBulon = 25;
                    break;
                case R.id.rBtn32:
                    diametroBulon = 32;
                    break;
                default:
                    Toast.makeText(this, "Introduce diamtro bulon", Toast.LENGTH_SHORT);
            }


            resultado.setText("Para barra Ø" + diametroBulon + " de " + l + " m son :" + kgCemento + " kg");
            total.setText("Para " + n + " bulones de Ø" + diametroBulon + " de " + l + " m son :" + kgCemento * n + " kg");
        }
        }
    }


