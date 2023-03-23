package com.ejercicio.examen002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView  lista;
    List <String> cargo;
    List <String> comp;
    //ARREGLO DE IMAGENES
    int[] img;
    List<String> foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.lsvPersonas);

        foto = new ArrayList<String>();
        foto.add("Andres Perez");
        foto.add("Mauricio Ramos");
        foto.add("Roberto Rodriguez");
        foto.add("Jimena Alfaro");
        foto.add("Ernesto Chamul");
        foto.add("Manuel Henriquez");
        foto.add("Erick Sandoval");
        foto.add("Rosa De Maria");
        foto.add("Lizeth Astrada");

        cargo = new ArrayList<String>();
        cargo.add("CEO");
        cargo.add("Asistente");
        cargo.add("Director de Marketing");
        cargo.add("Disenadora de producto");
        cargo.add("Supervisor de ventas");
        cargo.add("CEO");
        cargo.add("CTO");
        cargo.add("lead Programmer");
        cargo.add("Directora de Marketing");
        cargo.add("CEO");

        comp = new ArrayList<String>();
        comp.add("Insures S.O");
        comp.add("Hospita; Blue");
        comp.add("Electrical Parts Itd");
        comp.add("Creativa App");
        comp.add("Neumaticos press");
        comp.add("Banco Nacional");
        comp.add("Cooperativa Verde");
        comp.add("FrutiSofy");
        comp.add("Seguros Boliver");
        comp.add("Concesionario Motolox");


        int[] pictures={
                R.drawable.foto1,
                R.drawable.foto2,
                R.drawable.foto3,
                R.drawable.foto4,
                R.drawable.foto5,
                R.drawable.foto6,
                R.drawable.foto7,
                R.drawable.foto8,
                R.drawable.foto9,
                R.drawable.foto10,
        };


        //ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        Adaptador adaptador = new Adaptador(this,R.layout.elemento,foto,cargo,comp,pictures);

        lista.setAdapter(adaptador);
        //llenamos el adaptador

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //VARIABLES DISTINTAS
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Selecciono "+foto.get(i), Toast.LENGTH_SHORT).show();
            }
        });



    }
}