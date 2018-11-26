package com.example.dani.serieaffinity;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class SerieViewModel extends AndroidViewModel {

     SerieRepository sRepository;

    public SerieViewModel(@NonNull Application application) {
        super(application);

        sRepository = new SerieRepository(application);


    }


    public void insertSerie(Serie serie){
        sRepository.insert(serie);
    }

   LiveData<List<Serie>> getSeries(){
        return sRepository.getSeries();
    }



    public LiveData<Serie> getSerie(int id){


        return  sRepository.getSerie(id);
    }





}



