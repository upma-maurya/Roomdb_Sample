package com.example.task;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Data.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase noteDB;
    public abstract taskDao taskDao();//calling

    public static AppDatabase getInstance(Context context) {
        if(null==noteDB)
        {
            noteDB = createInstance(context);
        }
        return noteDB;

    }

    private static AppDatabase createInstance(Context context)
    {
        return Room.databaseBuilder(context,AppDatabase.class,"NoteApp").allowMainThreadQueries().build();
    }

}
