package com.example.assignment_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class Q7NavigationdrawerActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;
    private TextView name,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7_navigationdrawer);

        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawer);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("App");

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(Q7NavigationdrawerActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.gallery:
                        Toast.makeText(Q7NavigationdrawerActivity.this, "Gallery", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.slideshow:
                        Toast.makeText(Q7NavigationdrawerActivity.this, "Slideshow", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.contact:
                        Toast.makeText(Q7NavigationdrawerActivity.this, "Contact", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.email:
                        Toast.makeText(Q7NavigationdrawerActivity.this, "Email", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        View hView =  navigationView.getHeaderView(0);
        name = hView.findViewById(R.id.name);
        email = hView.findViewById(R.id.email);
        name.setText("Jisha Patel");
        email.setText("Jisha1810@gmail.com");


    }



    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}