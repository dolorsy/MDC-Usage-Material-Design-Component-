package com.dolor.mdcusage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button floatActionButton,sliderButton,appBarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatActionButton = (Button) findViewById(R.id.floating_action_button);
        sliderButton = findViewById(R.id.slider_button);
        appBarButton = findViewById(R.id.app_bar_button);
        sliderButton.setOnClickListener(this);
        floatActionButton.setOnClickListener(this);
        appBarButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.floating_action_button:
                startActivity(makeIntent(FloatingActionButtonUsage.class));
                break;
            case R.id.slider_button:
                Toast.makeText(getApplicationContext(),"slider Button",Toast.LENGTH_SHORT).show();
                startActivity(makeIntent(NavigationDrawerUsage.class));
                break;
            case R.id.app_bar_button:
                Toast.makeText(getApplicationContext(),"app_bar Button",Toast.LENGTH_SHORT).show();
               startActivity(makeIntent(AppBarUsage.class));
                break;
            case R.id.test_button:
                Toast.makeText(getApplicationContext(),"Test!!!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private Intent makeIntent(Class cl){
        return new Intent(getApplicationContext(),cl);
    }
}
