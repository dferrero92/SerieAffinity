package com.example.dani.serieaffinity;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        findViewById(R.id.botonAñadirSerie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//

                Serie serie = new Serie();
                serie.title =findViewById(R.id.nombre_serie).toString();
                ViewModelProviders.of(NewActivity.this).get(SerieViewModel.class).insertSerie(serie);






            }
        });

    }
}
