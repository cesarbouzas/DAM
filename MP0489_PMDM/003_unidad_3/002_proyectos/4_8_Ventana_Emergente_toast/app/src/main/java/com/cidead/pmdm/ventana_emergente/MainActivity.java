package com.cidead.pmdm.ventana_emergente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar=(Button) findViewById(R.id.btn_Enviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etMsg=(EditText) findViewById(R.id.et_mensaje);
                TextView tvMsg=(TextView) findViewById(R.id.tv_msg);
                tvMsg.setText(etMsg.getText());
                Toast.makeText(MainActivity.this, "Mensaje enviado ", Toast.LENGTH_SHORT).show();
                tvMsg.setVisibility(View.VISIBLE);
            }
        });

    }
}