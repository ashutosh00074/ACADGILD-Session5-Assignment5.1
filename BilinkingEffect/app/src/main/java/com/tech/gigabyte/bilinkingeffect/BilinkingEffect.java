package com.tech.gigabyte.bilinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BilinkingEffect extends AppCompatActivity implements AnimationListener {

    Animation animationfadein;
    TextView txtdata;
    Button btnfadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilinking_effect);

        setContentView(R.layout.blinkingeffect_layout);          //Passing Layout (RelativeLayout=blinkingeffect_layout)

        txtdata = (TextView) findViewById(R.id.tv);
        btnfadein = (Button) findViewById(R.id.btn);

        animationfadein = AnimationUtils.loadAnimation(this, R.anim.fade_in);  //load the animation

        btnfadein.setOnClickListener(new View.OnClickListener() {            //set animation listener
            @Override
            public void onClick(View v) {                        //Auto-generated method stub
                txtdata.setVisibility(View.VISIBLE);
                txtdata.startAnimation(animationfadein);           // start the animation
            }
        });

    }

    @Override
    public void onAnimationStart(Animation animation) {         //Auto-generated method stub

    }

    @Override
    public void onAnimationEnd(Animation animation) {          //Auto-generated method stub

        Toast.makeText(getBaseContext(), "Animation Stopped!", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {         //Auto-generated method stub

    }
}
