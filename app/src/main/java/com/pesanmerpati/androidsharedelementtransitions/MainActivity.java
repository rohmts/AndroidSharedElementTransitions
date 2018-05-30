package com.pesanmerpati.androidsharedelementtransitions;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageViewCat;
    private TextView mTextViewDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageViewCat = findViewById(R.id.imageViewCat);
        mTextViewDesc = findViewById(R.id.textViewDesc);

        mTextViewDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetail = new Intent(MainActivity.this, DetailCatActivity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        MainActivity.this, mImageViewCat, ViewCompat.getTransitionName(mImageViewCat));
                startActivity(intentDetail, optionsCompat.toBundle());
            }
        });
    }
}
