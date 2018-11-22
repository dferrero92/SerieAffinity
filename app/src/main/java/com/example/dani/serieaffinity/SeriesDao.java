package com.example.dani.serieaffinity;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;


@Dao
public interface SeriesDao {
        @Insert
        void insert (Serie serie);

        @Query("SELECT * from Serie")
        LiveData<List<Serie>> getSeries();

    }





