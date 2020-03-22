package com.dolor.mdcusage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button floatActionButton,sliderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatActionButton = (Button) findViewById(R.id.floating_action_button);
        sliderButton=findViewById(R.id.slider_button);
        sliderButton.setOnClickListener(this);
        floatActionButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.floating_action_button:
               // Intent FABIntent = new Intent(getApplicationContext(), FloatingActionButtonUsage.class);
                startActivity(makeIntent(FloatingActionButtonUsage.class));
                break;
            case R.id.slider_button:
                startActivity(makeIntent(SeekBarUsage.class));
                break;
        }
    }
    private Intent makeIntent(Class cl){
        return new Intent(getApplicationContext(),cl);
    }
}
