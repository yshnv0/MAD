package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;

public class MainActivity extends AppCompatActivity {

    private EditText n,e,p,a;
    private RadioGroup g;
    private Spinner d;
    private CheckBox c1,c2,c3,c4;
    private Button b;
    String nm,em,ph,ag,dg
            ;
    int gn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n=(EditText) findViewById(R.id.e1);
        e=(EditText) findViewById(R.id.e2);
        p=(EditText) findViewById(R.id.e3);
        a=(EditText) findViewById(R.id.e4);
        g=(RadioGroup) findViewById(R.id.r1);
        d=(Spinner) findViewById(R.id.deg);
        c1=(CheckBox) findViewById(R.id.cb1);
        c2=(CheckBox) findViewById(R.id.cb2);
        c3=(CheckBox) findViewById(R.id.cb3);
        c4=(CheckBox) findViewById(R.id.cb4);
        b=(Button) findViewById(R.id.bt);


        List<String> items=new ArrayList<>();
        items.add(0,"Select your degree");
        items.add("MCA");
        items.add("BCA");
        items.add("MSc");
        items.add("Bsc");

        ArrayAdapter<String> dataAdapter;
        dataAdapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item,items);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        d.setAdapter(dataAdapter);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm=n.getText().toString().trim();
                em=e.getText().toString().trim();
                ph=p.getText().toString().trim();
                ag=a.getText().toString().trim();
                dg=d.getSelectedItem().toString().trim();
                gn=g.getCheckedRadioButtonId();

                if(nm.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Enter your name",Toast.LENGTH_SHORT).show();
                }
                else if(em.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Enter your email",Toast.LENGTH_SHORT).show();
                }
                else if(ph.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Enter your phone number",Toast.LENGTH_SHORT).show();
                }
                else if(ag.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Enter your age",Toast.LENGTH_SHORT).show();
                }
                else if(gn==-1)
                {
                    Toast.makeText(MainActivity.this,"Enter your gender",Toast.LENGTH_SHORT).show();
                }
                else if(dg.equals("Select your degree"))
                {
                    Toast.makeText(MainActivity.this,"Enter your degree",Toast.LENGTH_SHORT).show();
                }
                else if(!c1.isChecked() && !c2.isChecked() && !c3.isChecked() && !c4.isChecked())
                {
                    Toast.makeText(MainActivity.this,"Enter any language",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
