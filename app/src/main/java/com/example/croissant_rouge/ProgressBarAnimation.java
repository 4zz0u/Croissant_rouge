package com.example.croissant_rouge;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarAnimation extends Animation {
    private Context context;
    private TextView progress_percentage;
    private ProgressBar progressBar;
    private float from;
    private float to;

    public ProgressBarAnimation(Context context, ProgressBar progressBar, TextView progress_percentage,float from, float to) {
        this.context = context;
        this.progressBar = progressBar;
        this.progress_percentage = progress_percentage;
        this.from = from;
        this.to = to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;
        progressBar.setProgress((int)value);
        progress_percentage.setText((int)value + " %");

        if (value == to) {
            context.startActivity(new Intent(context, HomeActivity.class));
        }
    }
}
