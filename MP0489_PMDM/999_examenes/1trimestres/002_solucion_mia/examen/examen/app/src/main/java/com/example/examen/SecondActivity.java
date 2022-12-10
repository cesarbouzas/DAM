package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Bundle datos;
    int fotoid;
    String name;
    TextView title;
    ImageView image;
    Button btn_Volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        datos=getIntent().getExtras();
        name= datos.getString("nombre");
        fotoid=datos.getInt("foto");
        title=(TextView) findViewById(R.id.tv_titulo_nombre);
        title.setText(name);
        image=(ImageView) findViewById(R.id.imageView);
        image.setImageResource(fotoid);

    }
    @Override
    public void finish() {
        Intent data = new Intent();
        data.putExtra("RETORNO", "Este es el valor de retorno");
        setResult(RESULT_OK, data);
        super.finish();
    }
}
