package com.example.eventsticketbuyingdesignproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationHomeView;

    FrameLayout contentsFrame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        contentsFrame = findViewById(R.id.FragmentContents);
        
        bottomNavigationHomeView = findViewById(R.id.BottomNavigationBarHome);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HomeFragment homeFragment = new HomeFragment();
        fragmentTransaction.replace(R.id.FragmentContents, homeFragment);
        fragmentTransaction.commit();


        fragmentTransaction.replace(R.id.FragmentContents,homeFragment);
        
        bottomNavigationHomeView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                HomeFragment homeFragment = new HomeFragment();
                SearchFragment searchFragment = new SearchFragment();
                ProfileFragment profileFragment = new ProfileFragment();
                TicketFragment ticketFragment = new TicketFragment();

                switch(item.getItemId()){
                    case R.id.menuHome:
                        fragmentTransaction.replace(R.id.FragmentContents, homeFragment);
                        fragmentTransaction.commit();
                        break;
                    case R.id.menuTicket:
                        fragmentTransaction.replace(R.id.FragmentContents, ticketFragment);
                        fragmentTransaction.commit();
                        break;
                    case R.id.menuSearch:
                        fragmentTransaction.replace(R.id.FragmentContents, searchFragment);
                        fragmentTransaction.commit();
                        break;
                    case R.id.menuProfile:
                        fragmentTransaction.replace(R.id.FragmentContents, profileFragment);
                        fragmentTransaction.commit();
                        break;
                }

                return true;
            }
        });
    }
}