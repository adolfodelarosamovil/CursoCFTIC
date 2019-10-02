package com.adp.cursocftic;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimacionesActivity extends AppCompatActivity {

    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animaciones);

        ImageView imagenView = findViewById(R.id.carrusel);
        imagenView.setBackgroundResource(R.drawable.imagenes_animacion);
        this.animationDrawable = (AnimationDrawable) imagenView.getBackground();
        this.animationDrawable.start();
    }
}
