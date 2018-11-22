package com.example.dani.serieaffinity;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Serie {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String author;
    public String title;
    public String sinopsis;
    public float rating;
}