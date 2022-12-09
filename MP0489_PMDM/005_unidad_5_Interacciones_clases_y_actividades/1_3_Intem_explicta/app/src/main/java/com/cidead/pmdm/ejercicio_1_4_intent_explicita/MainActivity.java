package com.cidead.pmdm.ejercicio_1_4_intent_explicita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIrSegundaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIrSegundaActivity=(Button) findViewById(R.id.btn_ir_segunda_activity);
        btnIrSegundaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SegundaActivity.class);
                startActivity(i);
            }
        });

    }
}