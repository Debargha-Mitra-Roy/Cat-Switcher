package com.example.catswitcher;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void switchCat(View view) {
        Log.i("Info", "Button Pressed");
        ImageView image = findViewById(R.id.catImageView);
        image.setImageResource(R.drawable.cat2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}