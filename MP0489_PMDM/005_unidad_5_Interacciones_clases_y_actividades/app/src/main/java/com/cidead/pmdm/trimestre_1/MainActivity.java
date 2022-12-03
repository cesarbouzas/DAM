package com.cidead.pmdm.trimestre_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarCategoria(View view) {
        boolean checked=((RadioButton)view).isChecked();
        Intent intent =new Intent(this,secondActivity.class);

        switch (view.getId()){
            case R.id.radioButtonFrutas:
                Toast.makeText(this,"selecionado Frutas",Toast.LENGTH_SHORT).show();
                intent.putExtra("categoriaSelect",0);
                break;
            case R.id.radioButtonAlergenos:
                Toast.makeText(this,"selecionado Alergenos",Toast.LENGTH_SHORT).show();
                intent.putExtra("categoriaSelect",1);
                break;
            case R.id.radioButtonCosmetica:
                Toast.makeText(this,"selecionado Cosmética",Toast.LENGTH_SHORT).show();
                intent.putExtra("categoriaSelect",2);
                break;
            case R.id.radioButtonProximidad:
                Toast.makeText(this,"selecionado Proximaidad",Toast.LENGTH_SHORT).show();
                intent.putExtra("categoriaSelect",3);
                break;
        }
            startActivityForResult(intent,1);
    }

    }
