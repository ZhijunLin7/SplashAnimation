package com.example.splashanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.splashanimation.databinding.ActivitySplashAnimationBinding;

public class SplashAnimation extends AppCompatActivity {
    private ActivitySplashAnimationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySplashAnimationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation animation2 = AnimationUtils.loadAnimation(SplashAnimation.this, R.anim.anim2);
                animation2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent=new Intent(SplashAnimation.this,MainActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                binding.titol2.startAnimation(animation2);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        binding.titol.startAnimation(animation);
        binding.imageview1.startAnimation(animation);
        binding.imageview2.startAnimation(animation);
        binding.imageview3.startAnimation(animation);
        binding.imageview4.startAnimation(animation);
    }

    @Override
    protected void onPause() {
        super.onPause();
        binding.titol.clearAnimation();
        binding.imageview1.clearAnimation();
        binding.imageview2.clearAnimation();
        binding.imageview3.clearAnimation();
        binding.imageview4.clearAnimation();
        binding.titol2.clearAnimation();
    }
}