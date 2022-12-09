package com.cidead.pmdm.pasoparametro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {
    WebView wbVista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        wbVista=(WebView) findViewById(R.id.wv_vista);

        wbVista.loadUrl("https://"+getIntent().getExtras().getString("url"));
    }
}