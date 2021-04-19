package com.example.assignment_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Q6SecondActivity extends AppCompatActivity {
    TextView q6tv1, q6tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6_second);

        q6tv1 = findViewById(R.id.q6tv1);
        q6tv2 = findViewById(R.id.q6tv2);

        q6tv1.setText("Welcome " + getIntent().getStringExtra("uname"));
        q6tv2.setText("Your password is:  " + getIntent().getStringExtra("pass"));
    }
}