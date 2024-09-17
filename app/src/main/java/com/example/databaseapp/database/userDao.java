package com.example.databaseapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface userDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    void insertAll(UsersEntity... users);

    @Query("SELECT User from USERTABLE")
    List<String> getAll();


}
