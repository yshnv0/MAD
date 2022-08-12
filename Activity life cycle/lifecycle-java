package com.example.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate called", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart called", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume called", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause called", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop called", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart called", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy called", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onDestroy called");
    }
}
