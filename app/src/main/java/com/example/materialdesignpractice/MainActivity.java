package com.example.materialdesignpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parentLayout = findViewById(R.id.mainLayout);
    }

    public void showToastBar(View view) {
        Snackbar snackbar =  Snackbar.make(parentLayout,"Hello there...", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("DISMISS", view1 -> {
            snackbar.dismiss();
        });
        snackbar.setActionTextColor(Color.WHITE);
        snackbar.show();
    }
}