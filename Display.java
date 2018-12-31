package com.example.sb_121.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class Display extends AppCompatActivity {

    ImageView imageView;
    GridView grid;
    DisplayAdapter displayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        grid = (GridView) findViewById(R.id.grid);
        displayAdapter = new DisplayAdapter(Display.this);

        grid.setAdapter(displayAdapter);

        /*imageView = (ImageView) findViewById(R.id.img);*/

       // imageView.setImageResource(MainActivity.imgList.get(1));
    }
}
