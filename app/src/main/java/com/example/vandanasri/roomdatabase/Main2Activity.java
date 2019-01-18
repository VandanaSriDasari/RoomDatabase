package com.example.vandanasri.roomdatabase;

import android.arch.lifecycle.ViewModelProviders;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vandanasri.roomdatabase.RoomDatabase.FavouriteMovie;
import com.example.vandanasri.roomdatabase.RoomDatabase.MyDatabase;

public class Main2Activity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    MyDatabase database;
   ViewModel vm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        e3=findViewById(R.id.ed3);
        e4=findViewById(R.id.ed4);
        database= Room.databaseBuilder(Main2Activity.this,MyDatabase.class,"MOVIE").allowMainThreadQueries().build();
        vm1= ViewModelProviders.of(this).get(ViewModel.class);
    }

    public void click(View view) {
        String s1=e1.getText().toString().trim();
        String s2=e2.getText().toString().trim();
        double s3= Double.parseDouble(e3.getText().toString().trim());
        String s4=e4.getText().toString().trim();
        if(!TextUtils.isEmpty(s1)){
            FavouriteMovie fm=new FavouriteMovie();
            fm.setMovie_title(s1);
            fm.setMovie_descc(s2);
            fm.setRating(s3);
            fm.setMovie_poster(s4);
            database.myDao().insertData(fm);
            Toast.makeText(this, "data stored successsfully", Toast.LENGTH_SHORT).show();
            finish();
        }else{
            Toast.makeText(this, "add movie title", Toast.LENGTH_SHORT).show();
        }
    }
}
