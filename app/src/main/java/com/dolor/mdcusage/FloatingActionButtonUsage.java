package com.dolor.mdcusage;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FloatingActionButtonUsage extends AppCompatActivity {
    boolean isOpen;
    Animation openAnim,closeAnim;
    @BindView(R.id.fab)
    FloatingActionButton mainFAB;
    @BindView(R.id.coordinator_layout)
    CoordinatorLayout coordinatorLayout;
    @BindView(R.id.floatingActionButton2)
    FloatingActionButton floatingActionButton2;
    @BindView(R.id.floatingActionButton3)
    FloatingActionButton floatingActionButton3;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.textView2)
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button_usage);
        ButterKnife.bind(this);
        openAnim = AnimationUtils.loadAnimation(this,R.anim.open_scale_and_alpha);
        closeAnim = AnimationUtils.loadAnimation(this,R.anim.close_scale_and_alpha);
        isOpen = false;

    }

    @OnClick(R.id.fab)
    public void onViewClicked() {
        if(isOpen){

            floatingActionButton2.setAnimation(closeAnim);
            floatingActionButton3.setAnimation(closeAnim);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            isOpen = false;
        }else{
            floatingActionButton2.setAnimation(openAnim);
            floatingActionButton3.setAnimation(openAnim);
            textView2.setVisibility(View.VISIBLE);
            textView3.setVisibility(View.VISIBLE);
            isOpen = true;
        }
    }
}