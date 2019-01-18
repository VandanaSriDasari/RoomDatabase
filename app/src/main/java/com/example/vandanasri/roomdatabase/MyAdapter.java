package com.example.vandanasri.roomdatabase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vandanasri.roomdatabase.RoomDatabase.FavouriteMovie;

import java.util.List;

/**
 * Created by Vandana Sri on 11-Jul-18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    List<FavouriteMovie>l;
    public MyAdapter(MainActivity mainActivity, List<FavouriteMovie> list) {
        context=mainActivity;
        l=list;

    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.raw,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        holder.t.setText(l.get(position).getMovie_title());
        holder.t1.setText(l.get(position).getMovie_descc());
        holder.t2.setText(""+l.get(position).getRating());
        holder.t3.setText(l.get(position).getMovie_poster());


    }

    @Override
    public int getItemCount() {
        return l.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t,t1,t2,t3;
        public MyViewHolder(View itemView) {
            super(itemView);
            t=itemView.findViewById(R.id.tv);
            t1=itemView.findViewById(R.id.tv1);
            t2=itemView.findViewById(R.id.tv2);
            t3=itemView.findViewById(R.id.tv3);
        }
    }
}
