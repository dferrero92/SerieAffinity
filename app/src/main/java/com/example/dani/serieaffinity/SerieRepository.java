package com.example.dani.serieaffinity;

import android.app.Application;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class SerieRepository {


    SeriesDao seriesDao;


    SerieRepository(Application application){
       seriesDao= SerieRoomDatabase.getDatabase(application).SerieDAO();
    }



    public void insert(Serie serie){
        new insertAsync
    }


    LiveData<List<Serie>> getSeries(){

        return seriesDao.getSeries();
    }


}
