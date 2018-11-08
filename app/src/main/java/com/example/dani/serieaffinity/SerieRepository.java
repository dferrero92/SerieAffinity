package com.example.dani.serieaffinity;

import android.app.Application;

public class SerieRepository {


    SeriesDao seriesDao;


    SerieRepository(Application application){
       seriesDao= SerieRoomDatabase.getDatabase(application).SerieDAO();
    }


    void insert (Serie serie){
        seriesDao.insert(serie);
    }


}
