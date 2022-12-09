package com.cidead.pmdm.pasoparametro;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnIr;
    EditText etUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIr=(Button) findViewById(R.id.btn_ir);
        etUrl=(EditText)findViewById(R.id.et_url);
        btnIr.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(this,SecondActivity.class);
        i.putExtra("url",etUrl.getText().toString());
        startActivity(i);
    }
}