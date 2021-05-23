package com.toni.recyclerview2;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.toni.recyclerview2.model.Deporte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DeporteActivity extends AppCompatActivity {

    ImageView imgFondo;
    TextView txtDescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deporte);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);


        imgFondo = findViewById(R.id.imgFondo);
        txtDescripcion = findViewById(R.id.txtDescripcion);

        Intent intent = getIntent();
        Deporte deporte = (Deporte) intent.getSerializableExtra("item");
        toolBarLayout.setTitle(deporte.getNombre());
        int idImage = getResources().getIdentifier(deporte.getImagen(), "drawable", getPackageName());
        imgFondo.setImageResource(idImage);
        txtDescripcion.setText(deporte.getDescripcion());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}