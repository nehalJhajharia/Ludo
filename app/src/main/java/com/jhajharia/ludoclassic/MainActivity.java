package com.jhajharia.ludoclassic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollDice(View view) {
        ImageView ourView = findViewById(R.id.dice);
        ourView.setImageResource(R.drawable.dice);
        int randomNum = 1 + (int)(6 * Math.random());
        if (randomNum > 6 || randomNum < 1) {
            rollDice(view);
            return;
        }
        Animation rotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
        ourView.startAnimation(rotation);
        switch (randomNum) {
            case 1 :
                ourView.setImageResource(R.drawable.one);
                break;
            case 2 :
                ourView.setImageResource(R.drawable.two);
                break;
            case 3 :
                ourView.setImageResource(R.drawable.three);
                break;
            case 4 :
                ourView.setImageResource(R.drawable.four);
                break;
            case 5 :
                ourView.setImageResource(R.drawable.five);
                break;
            case 6 :
                ourView.setImageResource(R.drawable.six);
                break;
        }
    }
}