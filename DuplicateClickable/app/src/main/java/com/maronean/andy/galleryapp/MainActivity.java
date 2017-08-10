package com.maronean.andy.galleryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private int IMAGE_SELECTOR= 0;
    String[] files = {"cat.jpg","bun.jpg","horse.jpg","pbear.jpg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.imageView4);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(IMAGE_SELECTOR){
                    case 0:
                        ((ImageView)v).setImageResource(R.drawable.cat);
                        IMAGE_SELECTOR++;
                        break;
                    case 1:
                        ((ImageView)v).setImageResource(R.drawable.horse);
                        IMAGE_SELECTOR++;
                        break;
                    case 2:
                        ((ImageView)v).setImageResource(R.drawable.pbear);
                        IMAGE_SELECTOR++;
                        break;
                    case 3:
                        ((ImageView)v).setImageResource(R.drawable.bun);
                        IMAGE_SELECTOR = 0;
                        break;


                }
            }
        });

    }
}
