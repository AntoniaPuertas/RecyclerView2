package com.toni.recyclerview2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.toni.recyclerview2.model.Deporte;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaDeportesAdapter extends RecyclerView.Adapter<ListaDeportesAdapter.DeportesHolder> {

    private final ArrayList<Deporte> listaDeportes;
    private LayoutInflater inflater;
    private Context context;

    public ListaDeportesAdapter(Context context, ArrayList<Deporte> listaDeportes){
        inflater = LayoutInflater.from(context);
        this.listaDeportes = listaDeportes;
        this.context = context;
    }
    @NonNull
    @Override
    public DeportesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = inflater.inflate(R.layout.deporte_item, parent, false);
        return new DeportesHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull DeportesHolder holder, int position) {
        Deporte currentItem = listaDeportes.get(position);
        int idImage = context.getResources().getIdentifier(currentItem.getImagen(), "drawable", context.getPackageName());
        holder.imgDeporte.setImageResource(idImage);
        holder.txtNombreDeporte.setText(currentItem.getNombre());
    }

    @Override
    public int getItemCount() {
        return listaDeportes.size();
    }

    class DeportesHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgDeporte;
        TextView txtNombreDeporte;

        public DeportesHolder(@NonNull View itemView) {
            super(itemView);
            imgDeporte = itemView.findViewById(R.id.imgDeporte);
            txtNombreDeporte = itemView.findViewById(R.id.txtNombreDeporte);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Item pulsado", Toast.LENGTH_SHORT).show();
            int posicion = getLayoutPosition();
            Deporte deporte = listaDeportes.get(posicion);
            Intent intent = new Intent(context, DeporteActivity.class);
            intent.putExtra("item", deporte);
            context.startActivity(intent);
        }
    }
}
