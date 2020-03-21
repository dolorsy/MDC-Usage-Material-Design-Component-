package com.dolor.mdcusage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FloatingActionButtonUsage extends AppCompatActivity {
    boolean isOpen;

    Animation openAnim,closeAnim,rotait;
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
    @BindView(R.id.subMenu)
    ConstraintLayout subMenu;
    @BindView(R.id.FAB_main_layout)
    ConstraintLayout mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button_usage);
        ButterKnife.bind(this);
        openAnim = AnimationUtils.loadAnimation(this,R.anim.open_scale_and_alpha);
        closeAnim = AnimationUtils.loadAnimation(this,R.anim.close_scale_and_alpha);
        rotait = AnimationUtils.loadAnimation(this,R.anim.rotait_360);
        isOpen = false;


        subMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isOpen){
                    onViewClicked();
                    makeShortToast("subMenu Clicked");
                }


            }
        });
        subMenu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(isOpen){
                    makeShortToast("onLongClicked");
                    onViewClicked();
                }

                return false;
            }
        });

    }

    @OnClick(R.id.fab)
    public void onViewClicked() {
        if(isOpen){
            Snackbar snackbar = Snackbar.make(mainLayout,"Snack Bar Shown",Snackbar.LENGTH_SHORT);
            snackbar.setAction("A Toast?",view -> {makeShortToast("Snack Bar MSG");});
            snackbar.show();
            mainFAB.setAnimation(rotait);
            subMenu.setAnimation(closeAnim);
            floatingActionButton3.setAnimation(closeAnim);
            textView2.setAnimation(closeAnim);
            textView3.setAnimation(closeAnim);
            mainFAB.startAnimation(rotait);
            subMenu.startAnimation(closeAnim);
            isOpen = false;
        }else{
            subMenu.setAnimation(openAnim);
            floatingActionButton2.setAnimation(openAnim);
            floatingActionButton3.setAnimation(openAnim);
            textView2.setAnimation(openAnim);
            textView3.setAnimation(openAnim);
            mainFAB.startAnimation(rotait);
            subMenu.startAnimation(openAnim);
            isOpen = true;
        }
    }

    public  void makeShortToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}