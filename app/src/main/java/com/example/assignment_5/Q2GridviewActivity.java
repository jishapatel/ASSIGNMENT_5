package com.example.assignment_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Q2GridviewActivity extends AppCompatActivity {
    GridView simpleGrid;
    int countries[] = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_gridview);

        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        Q2CustomAdapter customAdapter = new Q2CustomAdapter(getApplicationContext(), countries);
        simpleGrid.setAdapter(customAdapter);
    }
}