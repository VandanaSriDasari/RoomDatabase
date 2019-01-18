package com.example.vandanasri.roomdatabase.RoomDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Vandana Sri on 10-Jul-18.
 */
@Entity
public class FavouriteMovie {

    @PrimaryKey(autoGenerate = true)
    int movie_id;

    String movie_title;
    String movie_descc;
    String movie_poster;
    double rating;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_descc() {
        return movie_descc;
    }

    public void setMovie_descc(String movie_descc) {
        this.movie_descc = movie_descc;
    }

    public String getMovie_poster() {
        return movie_poster;
    }

    public void setMovie_poster(String movie_poster) {
        this.movie_poster = movie_poster;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
