package com.example.dani.serieaffinity;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;



    @Database(entities = {Serie.class}, version = 1)
    public abstract class SerieRoomDatabase extends RoomDatabase {

        public abstract SeriesDao SerieDAO();

        private static volatile SerieRoomDatabase INSTANCE;

        static SerieRoomDatabase getDatabase(final Context context) {
            if (INSTANCE == null) {
                synchronized (SerieRoomDatabase.class) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                SerieRoomDatabase.class, "poem_database")
                                .build();
                    }
                }
            }
            return INSTANCE;
        }



}
