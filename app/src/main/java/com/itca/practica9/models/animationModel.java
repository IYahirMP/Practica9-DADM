package com.itca.practica9.models;

import android.view.View;

public class animationModel {

    private float currentY;
    private float maxY;
    private float minY;
    private int direction; //-1 means downwards, 1 means upwards.
    private int speed;

    public animationModel(float minY, float maxY, int speed, View view) {
        this.maxY = maxY;
        this.minY = minY;
        this.speed = speed;
        this.currentY = view.getTranslationY();
        this.direction = 1;

    }

    public void update() {
        if (currentY > maxY)
            direction = -1;
        else if (currentY < minY)
            direction = 1;

        currentY += direction * speed;
    }

    public float getCurrentY() {
        return currentY;
    }
}
