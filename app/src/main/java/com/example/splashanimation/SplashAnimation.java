package com.example.splashanimation;

import androidx.appcompat.app.AppCompatActivity;

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
        binding.titol.startAnimation(animation);

    }
}