package com.example.recycler_viewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycler_viewdemo.Adapter.RecyclerviewAdapter;
import com.example.recycler_viewdemo.Model.MyModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
       recyclerView =(RecyclerView)findViewById(R.id.recycler);


        ArrayList<MyModel> arrayList = new ArrayList<MyModel>();
        MyModel myModel= new MyModel("Java");
        MyModel myModel1= new MyModel("Android");
        MyModel myModel2= new MyModel("Php");
        MyModel myModel3= new MyModel(".Net");
        MyModel myModel4= new MyModel("Testing");
        MyModel myModel5= new MyModel("Webservices");
        MyModel myModel6= new MyModel("Angular js");
        MyModel myModel7= new MyModel("Node js");

        arrayList.add(myModel);
        arrayList.add(myModel1);
        arrayList.add(myModel2);
        arrayList.add(myModel3);
        arrayList.add(myModel4);
        arrayList.add(myModel5);
        arrayList.add(myModel6);
        arrayList.add(myModel7);


        RecyclerviewAdapter recyclerviewAdapter = new RecyclerviewAdapter(getApplicationContext(),arrayList);

    }
}

