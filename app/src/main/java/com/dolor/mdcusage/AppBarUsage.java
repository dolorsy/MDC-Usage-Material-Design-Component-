package com.dolor.mdcusage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class AppBarUsage extends AppCompatActivity  {
private Toolbar mainToolBar;
SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_usage);
        mainToolBar = findViewById(R.id.main_toolbar);

        setSupportActionBar(mainToolBar);
        mainToolBar.setOnMenuItemClickListener(item -> {
            Toast.makeText(getApplicationContext(),item.getTitle(),Toast.LENGTH_SHORT).show();
            return false;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.nav_menu,menu);
        return true;
    }



}
