package com.itca.practica9.presenters;

import com.itca.practica9.models.animationModel;
import com.itca.practica9.views.animationView;

public class animationPresenter {

    private animationModel model;
    private animationView view;
    public animationPresenter(animationModel model, animationView view) {
        this.model = model;
        this.view = view;
    }

    public void startAnimation() {
        new Thread(new Runnable(){
            @Override
            public void run(){
                while (true) {
                    try {
                        model.update();
                        new Thread(new Runnable() {
                            @Override
                                    public void run() {
                                view.updateTranslation(model.getCurrentY());
                            }
                        }).start();
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}

