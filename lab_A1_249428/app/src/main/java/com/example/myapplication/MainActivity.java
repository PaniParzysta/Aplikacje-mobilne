package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView wynik;
    EditText cena_po, procent;
    Button calc, clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cena_po=(EditText)findViewById(R.id.cena_po);
        procent=(EditText)findViewById(R.id.procent);

        calc=(Button)findViewById(R.id.calc);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pom1=cena_po.getText().toString();
                String pom2=procent.getText().toString();
                int a=Integer.parseInt(pom1);
                int b=Integer.parseInt(pom2);
                int pom=a*b/100;
                Toast.makeText(getApplicationContext(),String.valueOf(pom),Toast.LENGTH_LONG).show();
            }
        });





    }
}