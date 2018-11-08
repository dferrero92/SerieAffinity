package com.example.dani.serieaffinity;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class SerieViewModel extends AndroidViewModel {

     SerieRepository sRepository;

    public SerieViewModel(@NonNull Application application) {
        super(application);

        sRepository = new SerieRepository(application);


    }

    void insertSerie(Serie serie){
        //llamar al repositorio

        sRepository.insert(serie);

    }


}


