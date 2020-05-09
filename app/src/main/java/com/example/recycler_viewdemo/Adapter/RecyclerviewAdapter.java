package com.example.recycler_viewdemo.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler_viewdemo.Model.MyModel;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter
{

    Context applicationContext;
    ArrayList<MyModel> arrayList;

    public RecyclerviewAdapter(Context applicationContext, ArrayList<MyModel> arrayList) {

        this.applicationContext=applicationContext;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    private class MyHolder extends RecyclerView.ViewHolder
    {

        public MyHolder(@NonNull View itemView)
        {

            super(itemView);

        }
    }

    @Override
    public int getItemCount()
    {
        return arrayList.size();
    }
}
