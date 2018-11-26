package com.example.dani.serieaffinity;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class SerieRepository {


    SeriesDao seriesDao;



    SerieRepository(Application application){
       seriesDao= SerieRoomDatabase.getDatabase(application).SerieDAO();
    }

    LiveData<List<Serie>> getSeries(){

        return seriesDao.getSeries();
    }

    public LiveData<Serie> getSerie(int id){


        return  seriesDao.getSerie(id);
    }



    public void insert(Serie serie){
        new insertAsyncTask (seriesDao).execute(serie);
    }

    public static class insertAsyncTask extends AsyncTask<Serie, Void, Void> {

        private SeriesDao mAsyncTaskDao;

        insertAsyncTask(SeriesDao dao){
            mAsyncTaskDao = dao;
        }
        @Override
        protected Void doInBackground(final Serie... params){
            mAsyncTaskDao.insert(params[0]);
            return null;
        }

    }






}
