package com.example.dani.serieaffinity;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        findViewById(R.id.botonAñadirSerie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//
                EditText editText = findViewById(R.id.nombre_serie);
                String seriedada = editText.getText().toString();

                Serie serie = new Serie();
                serie.title = seriedada;

                SerieViewModel serieViewModel = ViewModelProviders.of(NewActivity.this).get(SerieViewModel.class);
                serieViewModel.insertSerie(serie);



                finish();


            }
        });

    }
}
