package com.example.anass.mobilefly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(this).load("https://s7g8.scene7.com/is/image/FLY//sixteen?fmt=jpg&wid=781&hei=1068").into(imageView);
    }
}
