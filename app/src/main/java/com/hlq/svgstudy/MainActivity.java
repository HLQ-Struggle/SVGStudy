package com.hlq.svgstudy;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        checkDrawable();
    }

    private void checkDrawable() {
        ImageView imageView = findViewById(R.id.img);
        Drawable drawable = imageView.getDrawable();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            VectorDrawable vectorDrawable = (VectorDrawable) drawable;
            imageView.setImageDrawable(vectorDrawable);
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

}
