package com.android.app.devops.addin_mobiledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List< DataModel > mFlowerList;
    DataAdapter mFlowerData;
    ArrayList<DataModel> name=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mRecyclerView = findViewById(R.id.listview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(HomePage.this, 1);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        name.add(new DataModel ("Chennai",R.drawable.banner1,"","11/2/2018","Addidas"));
        name.add(new DataModel ("Chennai",R.drawable.banner2,"","11/2/2018","Addidas"));
        name.add(new DataModel ("Chennai",R.drawable.banner4,"","11/2/2018","Addidas"));
        name.add(new DataModel ("Chennai",R.drawable.banner2,"","11/2/2018","Addidas"));
        name.add(new DataModel ("Chennai",R.drawable.banner1,"","11/2/2018","Addidas"));
        name.add(new DataModel ("Chennai",R.drawable.banner2,"","11/2/2018","Addidas"));
        name.add(new DataModel ("Chennai",R.drawable.banner4,"","11/2/2018","Addidas"));

        DataAdapter dad = new DataAdapter(name);
        mRecyclerView.setAdapter(dad);
    }
}
