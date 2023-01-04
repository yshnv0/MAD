package com.example.options;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id= item.getItemId();

        if(id==R.id.home)
        {
            Toast.makeText(this, "clicked option is home", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.set)
        {
            Intent in=new Intent(this,MainActivity2.class);
            startActivity(in);
        }
        if(id==R.id.abt)
        {
            Intent in=new Intent(this,MainActivity3.class);
            startActivity(in);
        }
        if(id==R.id.shr)
        {
            String url="https://www.google.com/".toString();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        }
        if(id==R.id.con)
        {
            Toast.makeText(this,"Contact",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);


    }
}
