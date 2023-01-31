package com.example.task;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface taskDao {
    @Insert
    void insert(Data task);
    @Delete
    void delete(Data delete);
    @Query("Select * from Data")
    List<Data> getAll();
}

