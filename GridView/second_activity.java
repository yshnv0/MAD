package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class second_activity extends AppCompatActivity {

    ImageView selectedImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        selectedImage=(ImageView) findViewById(R.id.selectedImage);
        Intent intent=getIntent();
        selectedImage.setImageResource(intent.getIntExtra("image",0));
    }
}
