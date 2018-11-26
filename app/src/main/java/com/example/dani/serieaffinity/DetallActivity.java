package com.example.dani.serieaffinity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class DetallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detall);

        getIntent().getExtras();


        final TextView tvTitulo = findViewById(R.id.TitleTextView);
        int id = getIntent().getIntExtra("SerieID",0);
        SerieViewModel serieViewModel = ViewModelProviders.of(this).get(SerieViewModel.class);


        serieViewModel.getSerie(id).observe(this, new Observer<Serie>() {
            @Override
            public void onChanged(@Nullable Serie serie) {



                    tvTitulo.setText(serie.title);


            }
        });









    }
}
