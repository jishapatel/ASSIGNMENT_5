package com.example.assignment_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Q4RecyclerviewActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4_recyclerview);

        recyclerView = findViewById(R.id.q4RecyclerView);

        ArrayList<Q4Model> list = new ArrayList<Q4Model>();
        list.add(new Q4Model("Apple", R.drawable.apple));
        list.add(new Q4Model("Kiwi", R.drawable.kiwi));
        list.add(new Q4Model("Orange", R.drawable.orange));
        list.add(new Q4Model("Strawberry", R.drawable.sb));

        Q4ImageAdapter adapter = new Q4ImageAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }
}