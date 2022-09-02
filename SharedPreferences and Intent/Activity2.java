package com.example.sharedpreferencesandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    public static final String DEFAULT="No Value Entered";
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ed1=(EditText) findViewById(R.id.user);
        ed2=(EditText) findViewById(R.id.pass);


    }
    public void Load(View view){
        SharedPreferences sp=getSharedPreferences("Data", Context.MODE_PRIVATE);
        String user=sp.getString("username",DEFAULT);
        String pass=sp.getString("password",DEFAULT);
        if (user.equals(DEFAULT) || pass.equals(DEFAULT)) {
            Toast.makeText(this, "Data Not Found", Toast.LENGTH_SHORT).show();
        }
        else {
            ed1.setText(user);
            ed2.setText(pass);
            Toast.makeText(this, "Data Retrieved", Toast.LENGTH_SHORT).show();
        }
    }

    public void Prev(View view) {

        Toast.makeText(this, "First Page", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);

    }
}
