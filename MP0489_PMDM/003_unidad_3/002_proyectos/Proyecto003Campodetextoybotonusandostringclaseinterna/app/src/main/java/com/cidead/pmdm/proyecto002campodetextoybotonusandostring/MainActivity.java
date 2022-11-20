package com.cidead.pmdm.proyecto002campodetextoybotonusandostring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
        Log.i("Estado","cliclo vida onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Estado","cliclo vida onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Estado","cliclo vida onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Estado","cliclo vida onPause");
    }

    @Override
    public void onClick(View view) {
        EditText et1=(EditText) findViewById(R.id.edit_message);
        System.out.println(et1.getText());
        Log.i("Estado","cliclo vida onClick");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Estado","cliclo vida onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Estado","cliclo vida onDestroy");
    }
}