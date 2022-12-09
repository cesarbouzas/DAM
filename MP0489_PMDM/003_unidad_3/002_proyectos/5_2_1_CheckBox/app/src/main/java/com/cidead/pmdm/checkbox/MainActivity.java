package com.cidead.pmdm.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    HashSet<String> frutasSel;
    Button btnComer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnComer=(Button) findViewById(R.id.btn_comer);
        frutasSel=new HashSet<>();
        CompoundButton.OnCheckedChangeListener escuchador=new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    frutasSel.add(compoundButton.getText().toString());

                }else{
                    frutasSel.remove(compoundButton.getText().toString());
                }
            }
        };
       ArrayList<CheckBox> frutas=new ArrayList<>();
       frutas.add((CheckBox) findViewById(R.id.cb_Fresa));
       frutas.add((CheckBox) findViewById(R.id.cb_Manzana));
       frutas.add((CheckBox) findViewById(R.id.cb_Pera));
       frutas.add((CheckBox) findViewById(R.id.cb_Naranja));
       for(CheckBox c:frutas){
           c.setOnCheckedChangeListener(escuchador);
       }
       btnComer=(Button) findViewById(R.id.btn_comer);
       btnComer.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this,frutasSel.toString(),Toast.LENGTH_LONG).show();
               Toast.makeText(MainActivity.this,"me comes los huevos tambien",Toast.LENGTH_LONG).show();
           }
       });

    }
}