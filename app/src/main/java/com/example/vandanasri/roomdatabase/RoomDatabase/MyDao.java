package com.example.vandanasri.roomdatabase.RoomDatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Vandana Sri on 10-Jul-18.
 */
@Dao
public interface MyDao {
    @Query("select * from FavouriteMovie")
    List<FavouriteMovie> getAllData();

    @Insert
    void insertData(FavouriteMovie fm);
    @Update
    void updataData(FavouriteMovie fm);
    @Delete
    void deleteData(FavouriteMovie fm);
}
