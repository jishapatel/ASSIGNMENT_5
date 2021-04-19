package com.example.assignment_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class Q3SpinnerActivity extends AppCompatActivity {
    String[] spinnerTitles;
    String[] spinnerPopulation;
    int[] spinnerImages;
    Spinner mSpinner;
    private boolean isUserInteracting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3_spinner);
        mSpinner = (Spinner) findViewById(R.id.spinner);
        spinnerTitles = new String[]{"Australia", "Brazil", "China", "France", "Germany", "India", "Ireland", "Italy", "Mexico", "Poland"};
        spinnerPopulation = new String[]{"24.13 Million", "207.7 Million", "1.379 Billion", "66.9 Million", "82.67 Million", "1.324 Billion", "4.773 Million", "60.6 Million", "127.5 Million", "37.95 Million"};
        spinnerImages = new int[]{R.drawable.flag_australia
                , R.drawable.flag_brazil
                , R.drawable.flag_china
                , R.drawable.flag_france
                , R.drawable.flag_germany
                , R.drawable.flag_india
                , R.drawable.flag_ireland
                , R.drawable.flag_italy
                , R.drawable.flag_maxico
                , R.drawable.flag_poland};

        Q3CustomAdapter mCustomAdapter = new Q3CustomAdapter(Q3SpinnerActivity.this, spinnerTitles, spinnerImages, spinnerPopulation);
        mSpinner.setAdapter(mCustomAdapter);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (isUserInteracting) {
                    Toast.makeText(Q3SpinnerActivity.this, spinnerTitles[i], Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        isUserInteracting = true;
    }
}