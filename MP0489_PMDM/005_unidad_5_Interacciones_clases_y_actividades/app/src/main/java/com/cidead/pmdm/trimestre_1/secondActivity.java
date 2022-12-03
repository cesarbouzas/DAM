package com.cidead.pmdm.trimestre_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class secondActivity extends AppCompatActivity {
    private ImageView logo;
    private TextView titulo;
    private TextView txtP1;
     private TextView txtP2;
     private TextView txtP3;
     private TextView txtP4;
     private Button btnP1;
     private Button btnP2;
     private Button btnP3;
     private Button btnP4;
     private Button btnVolver;
    ArrayList<Integer> productos;
    int selec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        logo=(ImageView) findViewById(R.id.imageViewCetagoria);
        titulo=(TextView) findViewById(R.id.textViewCategoria);
        txtP1=(TextView) findViewById(R.id.textViewC1);
        txtP2=(TextView) findViewById(R.id.textViewC2);
        txtP3=(TextView) findViewById(R.id.textViewC3);
        txtP4=(TextView) findViewById(R.id.textViewC4);
        btnP1=(Button) findViewById(R.id.buttonC1);
        btnP2=(Button) findViewById(R.id.buttonC2);
        btnP3=(Button) findViewById(R.id.buttonC3);
        btnP4=(Button) findViewById(R.id.buttonC4);
        btnVolver=(Button) findViewById(R.id.btnVolver);
        selec=getIntent().getExtras().getInt("categoriaSelect");
        productos=getIntent().getExtras().getIntegerArrayList("cesta");

        System.out.println(selec);
        switch (selec){
            case 0:
                    logo.setImageResource(R.mipmap.frutas);
                    titulo.setText("----SECCIÓN FRUTAS---- ");
                    txtP1.setText("Manzanas");
                    txtP2.setText("Peras");
                    txtP3.setText("Mandarinas");
                    txtP4.setText("Coco");
                    btnP1.setText("Añadir KG");
                    btnP2.setText("Añadir KG");
                    btnP3.setText("Añadir KG");
                    btnP4.setText("Añadir UND");
                break;
            case 1:
                logo.setImageResource(R.mipmap.alergenos_round);
                titulo.setText("----SECCIÓN ALERGENOS---- ");
                txtP1.setText("Fructosa");
                txtP2.setText("Lactosa");
                txtP3.setText("Gluten");
                txtP4.setText("Sulfitos");
                btnP1.setText(" +info");
                btnP2.setText(" +info");
                btnP3.setText(" +info");
                btnP4.setText(" +info");
                break;
            case 2:
                logo.setImageResource(R.mipmap.cosmetica);
                titulo.setText("----SECCIÓN COSMÉTICA---- ");
                txtP1.setText("Nivea");
                txtP2.setText("Champú");
                txtP3.setText("Pasta dental");
                txtP4.setText("Acondicionador");
                btnP1.setText("Añadir UND");
                btnP2.setText("Añadir UND");
                btnP3.setText("Añadir UND");
                btnP4.setText("Añadir UND");
                break;
            case 3:
                logo.setImageResource(R.mipmap.proximidas);
                titulo.setText("----SECCIÓN PROXIMIDAD---- ");
                txtP1.setText("Productos <5k");
                txtP2.setText("5km > Productos <10 km");
                txtP3.setText("Provinciales");
                txtP4.setText("Comunidad Autonoma");
                btnP1.setText(" +info");
                btnP2.setText(" +info");
                btnP3.setText(" +info");
                btnP4.setText(" +info");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selec);
        }

    }
    public void finish(){
        Intent data=new Intent();
        setResult(RESULT_OK,data);
        super.finish();


    }
}