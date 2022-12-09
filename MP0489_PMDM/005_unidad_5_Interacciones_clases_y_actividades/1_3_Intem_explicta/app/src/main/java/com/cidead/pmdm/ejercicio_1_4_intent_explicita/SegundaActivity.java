package com.cidead.pmdm.ejercicio_1_4_intent_explicita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        btnFinalizar= findViewById(R.id.btn_finalizar);
        btnFinalizar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.JELLY_BEAN){
            finishAffinity();

        }

    }
}