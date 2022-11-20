package com.cidead.pmdm.proyecto002campodetextoybotonusandostring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 Button bEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bEnviar=(Button) findViewById(R.id.b_enviar);
        bEnviar.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        EditText et1=(EditText) findViewById(R.id.edit_message);
        System.out.println(et1.getText());
    }
}