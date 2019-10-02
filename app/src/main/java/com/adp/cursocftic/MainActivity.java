package com.adp.cursocftic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animaciones(View view) {
        Intent intent = new Intent(this, AnimacionesActivity.class);
        startActivity(intent);
    }

    public void sonidos(View view) {
        Intent intent = new Intent(this, SonidosActivity.class);
        startActivity(intent);
    }
}
