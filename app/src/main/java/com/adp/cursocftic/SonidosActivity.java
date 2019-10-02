package com.adp.cursocftic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SonidosActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos);

        mediaPlayer = MediaPlayer.create(this, R.raw.juego_de_tronos);
        mediaPlayer.setLooping(false);
        mediaPlayer.setVolume(1100, 1100);
    }
}
