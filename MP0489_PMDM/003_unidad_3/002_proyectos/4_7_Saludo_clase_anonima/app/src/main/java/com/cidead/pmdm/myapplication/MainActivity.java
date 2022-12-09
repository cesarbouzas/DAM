package com.cidead.pmdm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button btn_Saludar;
    TextView tv_Saludo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Saludar=(Button) findViewById(R.id.btn_Saludar);
        tv_Saludo=(TextView) findViewById(R.id.tv_Saludo);
        btn_Saludar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tv_Saludo.setVisibility(View.VISIBLE);
            }
        }
        );



    }



}