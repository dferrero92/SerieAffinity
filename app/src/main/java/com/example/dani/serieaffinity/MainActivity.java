package com.example.dani.serieaffinity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Serie> serieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.new_serie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });


        SerieViewModel serieViewModel = ViewModelProviders.of(this).get(SerieViewModel.class);
        serieViewModel.getSeries().observe(this, new Observer<List<Serie>>() {
            @Override
            public void onChanged(@Nullable List<Serie> series) {
                for (int i = 0; i <series.size() ; i++) {
                    System.out.println(series.get(i).title);
                    System.out.println(series.get(i).author);
                }
            }
        });


        RecyclerView recyclerView = findViewById(R.id.serie_List);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
