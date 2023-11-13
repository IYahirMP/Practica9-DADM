package com.itca.practica9;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;

import com.itca.practica9.models.animationModel;
import com.itca.practica9.presenters.animationPresenter;
import com.itca.practica9.views.animationView;

public class animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        TextView caja = findViewById(R.id.animatedText);

        /*ObjectAnimator animator = ObjectAnimator.ofFloat(caja, "translationY", -400, 400);
        animator.setDuration(1000);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(Animation.INFINITE);
        animator.start();*/

        animationModel model = new animationModel(-400,400, 20, caja);
        animationView view = new animationView(caja);
        animationPresenter presenter = new animationPresenter(model, view);
        presenter.startAnimation();
    }
}