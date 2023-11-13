package com.itca.practica9.views;

import android.widget.TextView;

public class animationView {

    private TextView caja;

    public animationView(TextView caja) {
        this.caja = caja;
    }

    public void updateTranslation(float translationY) {
        caja.setTranslationY(translationY);
    }
}
