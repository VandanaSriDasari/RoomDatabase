package com.example.vandanasri.roomdatabase;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.vandanasri.roomdatabase.RoomDatabase.FavouriteMovie;
import com.example.vandanasri.roomdatabase.RoomDatabase.MyDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    MyDatabase database;
    MyAdapter adapter;
    ViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv);
        database= Room.databaseBuilder(this,MyDatabase.class,"MOVIE").allowMainThreadQueries().build();
        vm= ViewModelProviders.of(this).get(ViewModel.class);
        List<FavouriteMovie>list=new ArrayList<>();
        list=database.myDao().getAllData();
        vm.setList(list);
        Observer<List<FavouriteMovie>> observer=new Observer<List<FavouriteMovie>>() {
            @Override
            public void onChanged(@Nullable List<FavouriteMovie> favouriteMovies) {
                rv.setAdapter(new MyAdapter(MainActivity.this,favouriteMovies));
            }
        };
       vm.getList().observe(this,observer);
        LinearLayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
    }

    @Override
    protected void onResume() {
        super.onResume();
        vm.getList().setValue(database.myDao().getAllData());
    }

    public void fab(View view) {
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }
}
