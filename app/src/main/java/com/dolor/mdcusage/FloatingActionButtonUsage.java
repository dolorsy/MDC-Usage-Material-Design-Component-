package com.dolor.mdcusage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatingActionButtonUsage extends AppCompatActivity {
FloatingActionButton FAB;
    @Override
    protected void onCreate(Bundle savedInstanceState)
{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button_usage);
        FAB =  findViewById(R.id.fab);


        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Floating Clicked",Toast.LENGTH_LONG).show();
            }
        });


}
        }