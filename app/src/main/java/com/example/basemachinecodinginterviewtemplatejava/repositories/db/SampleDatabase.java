package com.example.basemachinecodinginterviewtemplatejava.repositories.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {SampleEntity.class}, version = 1)
public abstract class SampleDatabase extends RoomDatabase {

//    public abstract SearchPlacesDao searchPlacesDao();

}
