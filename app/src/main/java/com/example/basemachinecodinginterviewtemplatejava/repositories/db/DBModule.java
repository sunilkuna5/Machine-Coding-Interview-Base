package com.example.basemachinecodinginterviewtemplatejava.repositories.db;

import android.content.Context;

import androidx.room.Room;

import com.example.basemachinecodinginterviewtemplatejava.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class DBModule {

    private final Context context;

    public DBModule(Context context){
        this.context = context;
    }

    @Provides
    @ApplicationScope
    public SampleDatabase getDatabase(){
        return Room.databaseBuilder(context.getApplicationContext(),
                SampleDatabase.class, "sample-app-db.db")
                .addMigrations()
                .build();
    }

}
