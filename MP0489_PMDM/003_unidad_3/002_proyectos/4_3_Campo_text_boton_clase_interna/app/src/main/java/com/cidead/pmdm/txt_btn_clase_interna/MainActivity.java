package com.cidead.pmdm.txt_btn_clase_interna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    Button btnEnviar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar=(Button) findViewById(R.id.button);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText eTxt=(EditText) findViewById(R.id.etxtMsg);
                TextView txt=(TextView)  findViewById((R.id.txtResultado));
                txt.setText(eTxt.getText());
            }
        });

    }






}