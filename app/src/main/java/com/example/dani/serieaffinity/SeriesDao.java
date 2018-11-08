package com.example.dani.serieaffinity;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;


@Dao
public interface SeriesDao {
        @Insert
        void insert (Serie serie);
    }





