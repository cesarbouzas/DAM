package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 10;

    private ListView lv;
    private Adaptador adaptador;
    Intent intencion;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Animal> animales=new ArrayList<Animal>();


        Animal a1=new Animal();
        a1.setNombre("Gallina");
        a1.setDescripcion("La Gallina ponedora de primera");
        a1.setCodigo(1);
        a1.setFoto(R.drawable.gallinas_1);

        Animal a2=new Animal();
        a2.setNombre("vaca");
        a2.setDescripcion("La vaca Lechera llamada Marela");
        a2.setCodigo(2);
        a2.setFoto(R.drawable.vaca_2);


        Animal a3=new Animal();
        a3.setNombre("Perro");
        a3.setDescripcion("El perro se llama Pepa y es pastor belga");
        a3.setCodigo(3);
        a3.setFoto(R.drawable.perro_3);

        Animal a4=new Animal();
        a4.setNombre("Burro");
        a4.setDescripcion("El burro es un fenómeno haciendo carreteras");
        a4.setCodigo(4);
        a4.setFoto(R.drawable.burro_4);

        Animal a5=new Animal();
        a5.setNombre("Pato");
        a5.setDescripcion("El pato resulto ser un cisne de mayor");
        a5.setCodigo(5);
        a5.setFoto(R.drawable.pato_5);

        Animal a6=new Animal();
        a6.setNombre("Caballo");
        a6.setDescripcion("El Caballo participó en Casasnovas , quedó de último");
        a6.setCodigo(6);
        a6.setFoto(R.drawable.caballo_6);

        Animal a7=new Animal();
        a7.setNombre("Gallo");
        a7.setDescripcion("El gallo me despierta todas las mañanas , lo mato");
        a7.setCodigo(7);
        a7.setFoto(R.drawable.gallo_7);

        Animal a8=new Animal();
        a8.setNombre("Oveja");
        a8.setDescripcion("Cuando no puedas dormir cuentalas");
        a8.setCodigo(8);
        a8.setFoto(R.drawable.oveja_8);

        animales.add(a1);
        animales.add(a2);
        animales.add(a3);
        animales.add(a4);
        animales.add(a5);
        animales.add(a6);
        animales.add(a7);
        animales.add(a8);

        adaptador=new Adaptador(this,animales);
        lv=(ListView) findViewById(R.id.lv_animales);
        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                try{
                    Animal animal=(Animal)adaptador.getItem(i);
                    Toast.makeText(getBaseContext(),"El animal es"+animal.getNombre(),Toast.LENGTH_SHORT).show();
                    intencion= new Intent(MainActivity.this, SecondActivity.class);
                    intencion.putExtra("nombre",animal.getNombre());
                    intencion.putExtra("foto",animal.getFoto());
                    startActivityForResult(intencion,REQUEST_CODE);
                }catch( Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}