package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<>();

        list.add("omid");//0
        list.add("faran");//1
        list.add("shafi");//2
        list.add("surush");
        list.add("masih");
        list.add("heshmat");



        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        AdapterForMyRecyclerView adapterForMyRecyclerView = new AdapterForMyRecyclerView(MainActivity.this , list);

        recyclerView.setAdapter(adapterForMyRecyclerView);


    }
}