package com.example.calculator_gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String oldNumber="";
    String op="+";
    boolean isNewOp=true;
    EditText e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e=(EditText) findViewById(R.id.e1);
    }

    public void NumberEvent(View view) {
        if(isNewOp)
            e.setText("");
        isNewOp=false;

        String number=e.getText().toString();
        switch (view.getId()) {
            case R.id.b1:
                number+="1";
                break;
            case R.id.b2:
                number+="2";
                break;
            case R.id.b3:
                number+="3";
                break;
            case R.id.b4:
                number+="4";
                break;
            case R.id.b5:
                number+="5";
                break;
            case R.id.b6:
                number+="6";
                break;
            case R.id.b7:
                number+="7";
                break;
            case R.id.b8:
                number+="8";
                break;
            case R.id.b9:
                number+="9";
                break;
            case R.id.b0:
                number+="0";
                break;
            case R.id.clr:
                number="";
                break;

        }
        e.setText(number);

    }

    public void OperatorEvent(View view) {
        isNewOp=true;
        oldNumber=e.getText().toString();
        switch (view.getId()) {
            case R.id.add:
                op="+";
                break;
            case R.id.sub:
                op="-";
                break;
            case R.id.mul:
                op="*";
                break;
            case R.id.div:
                op="/";
                break;
        }
    }

    public void EqualEvent(View view) {
        String newNumber=e.getText().toString();
        double res=0.0;
        switch (op) {
            case "+":
                res=Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;
            case "-":
                res=Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;
            case "*":
                res=Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;
            case "/":
                res=Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
        }
        e.setText(res+"");
    }
}
