package com.example.assignment_5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Q6LoginAlerdialogActivity extends AppCompatActivity {
    EditText q6username, q6password;
    Button q6btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6_login_alerdialog);

        q6username = findViewById(R.id.q6username);
        q6password = findViewById(R.id.q6password);
        q6btnSubmit = findViewById(R.id.q6btnSubmit);

        q6btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab = new AlertDialog.Builder(Q6LoginAlerdialogActivity.this);
                ab.setCancelable(true)
                        .setTitle("Confirmation")
                        .setMessage("Are you sure?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), Q6SecondActivity.class).putExtra("uname", q6username.getText().toString()).putExtra("pass", q6password.getText().toString()));
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Try again", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });
    }
}