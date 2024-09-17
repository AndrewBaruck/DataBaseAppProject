package com.example.databaseapp.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Fts4;
import androidx.room.PrimaryKey;

@Fts4
@Entity(tableName = "userTable")
public class UsersEntity {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "rowid")
    public int numbers;

    @ColumnInfo(name = "User")
    public String userName;

    @ColumnInfo(name = "Pass")
    public String passWord;

}
