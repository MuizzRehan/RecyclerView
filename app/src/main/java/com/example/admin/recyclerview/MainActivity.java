package com.example.admin.recyclerview;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] titles;
    String[] description;
    int[] images = {R.drawable.facebook, R.drawable.instagram, R.drawable.twitter, R.drawable.google};
    ArrayList<DataProvider> arrayList = new ArrayList<DataProvider>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        titles = getResources().getStringArray(R.array.titles);
        description = getResources().getStringArray(R.array.description);
        int i = 0;
        for(String name : titles){
            DataProvider dataProvider = new DataProvider(images[i], titles[i], description[i]);
            arrayList.add(dataProvider);
            i++;
        }


        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
