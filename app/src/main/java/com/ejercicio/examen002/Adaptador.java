package com.ejercicio.examen002;


import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {
    Context contexto;
    int layout;
    List<String> foto;
    List<String> cargo;
    List<String> comp;
    int[]imagenes;

    public Adaptador(Context contexto) {
        this.contexto = contexto;
    }

    //CONSTRUCTOR


    public Adaptador(Context contexto, int layout, List<String> foto, List<String> cargo, List<String> comp, int[] imagenes) {
        this.contexto = contexto;
        this.layout = layout;
        this.foto = foto;
        this.cargo = cargo;
        this.comp = comp;
        this.imagenes = imagenes;
    }

    public int getCount() {
        return foto.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        LayoutInflater layoutInflater = LayoutInflater.from(contexto);
        v = layoutInflater.inflate(R.layout.elemento,null);

        TextView txtnombre = v.findViewById(R.id.textView);
        txtnombre.setText(foto.get(i));

        //DESCRIPCION
        TextView txtCargo = v.findViewById(R.id.textView4);
        txtCargo.setText(cargo.get(i));

        //compania
        TextView txtComp = v.findViewById(R.id.textView5);
        txtComp.setText(cargo.get(i));

        //fotos de perfil
        ImageView img = v.findViewById(R.id.imageView);
        img.setImageResource(imagenes[i]);
        return v;
    }
}
