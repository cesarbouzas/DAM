package com.cidead.pmdm.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rGroupColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    rGroupColor=(RadioGroup) findViewById(R.id.R_Group);
    rGroupColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if(i==-1){
                Toast.makeText(MainActivity.this, "Nada chequedo", Toast.LENGTH_SHORT).show();

            }else{
                String color=((RadioButton) radioGroup.findViewById(i)).getText().toString();
                Toast.makeText(MainActivity.this, color, Toast.LENGTH_SHORT).show();

            }
        }
    });


    }
}