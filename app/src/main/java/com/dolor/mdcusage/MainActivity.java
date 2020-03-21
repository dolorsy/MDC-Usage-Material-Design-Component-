package com.dolor.mdcusage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button floatActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatActionButton = (Button) findViewById(R.id.floating_action_button);
        floatActionButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.floating_action_button:
                Intent FABIntent = new Intent(getApplicationContext(), FloatingActionButtonUsage.class);
                startActivity(FABIntent);
                break;
        }
    }
}
