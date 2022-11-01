package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView grid;

    int icons[]=
            {
                    R.drawable.whatsapp,
                    R.drawable.instagram,
                    R.drawable.snapchat,
                    R.drawable.adidas,
                    R.drawable.nike,
                    R.drawable.puma,
                    R.drawable.lamborghini,
                    R.drawable.porsche,
                    R.drawable.bmw

            };
    String name[]={"Whatsapp","Instagram","Snapchat","Adidas","Nike","Puma","Lamborghini","Porsche","BMW"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid=(GridView)findViewById(R.id.grid);
        gridAdapter obj=new gridAdapter(this,name,icons);
        grid.setAdapter(obj);



    }
}
