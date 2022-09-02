package com.example.sharedpreferencesandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pwd);

    }

    public void Save(View view) {

        String usr = e1.getText().toString().trim();
        String psw = e2.getText().toString().trim();

        if (usr.equals("")) {
            Toast.makeText(this, "Enter Username", Toast.LENGTH_SHORT).show();
        } else if (psw.equals("")) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        } else {
            SharedPreferences sp = getSharedPreferences("Data", Context.MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putString("username", e1.getText().toString());
            ed.putString("password", e2.getText().toString());
            ed.commit();
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
        }
    }

    public void Next(View view) {

        Toast.makeText(this, "Second Page", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(this,Activity2.class);
        startActivity(in);
    }
}
