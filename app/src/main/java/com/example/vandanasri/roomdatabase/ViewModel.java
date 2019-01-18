package com.example.vandanasri.roomdatabase;

import android.arch.lifecycle.MutableLiveData;

import com.example.vandanasri.roomdatabase.RoomDatabase.FavouriteMovie;

import java.util.List;

/**
 * Created by Vandana Sri on 12-Jul-18.
 */

public class ViewModel extends android.arch.lifecycle.ViewModel {
    MutableLiveData<List<FavouriteMovie>>listt=new MutableLiveData<>();
    public ViewModel(){
        listt=new MutableLiveData<List<FavouriteMovie>>();
    }
   // List<FavouriteMovie>list;
    public MutableLiveData<List<FavouriteMovie>>getList(){
        if(listt==null){
           listt=new MutableLiveData<>();
        }
       return listt;
    }


    public void setList(List<FavouriteMovie> list) {
       listt.setValue(list);
    }
}
