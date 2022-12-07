package com.cidead.pmdm.txto_boton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bEnviar;
    EditText txt;
    String valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bEnviar=(Button) findViewById(R.id.b_enviar);
        txt=(EditText) findViewById(R.id.t_introducir);
        bEnviar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        System.out.println("El usuario ha introduducido el valor "+txt.getText());

    }
}