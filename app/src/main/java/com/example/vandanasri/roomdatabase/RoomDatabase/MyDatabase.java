package com.example.vandanasri.roomdatabase.RoomDatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Vandana Sri on 11-Jul-18.
 */
@Database(entities = {FavouriteMovie.class},version =1,exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {

    public abstract MyDao myDao();

}
