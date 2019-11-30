package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //selecting each view of the text views and setOnclick() -> to work whten we click on it
        //Start coding here
        TextView Family = (TextView) findViewById(R.id.Fmily_textLayout_mainActivity);
        Family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FamilyLayerAcccess = new Intent(MainActivity.this, Family.class);
                startActivity(FamilyLayerAcccess);
            }
        });

        TextView General = (TextView) findViewById(R.id.General_textLayout_mainActivity);
        General.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GeneralLayerAccess = new Intent(MainActivity.this, General.class);
                startActivity(GeneralLayerAccess);
            }
        });

        TextView Military = (TextView) findViewById(R.id.Military_textLayout_mainActivity);
        Military.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MilitaryLayerAccess = new Intent(MainActivity.this, Military.class);
                startActivity(MilitaryLayerAccess);
            }

            ;
        });

        TextView Numbers = (TextView) findViewById(R.id.Numbers_textLayout_mainActivity);
        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NumbersLayerAccess = new Intent(MainActivity.this, Colors.class);
                startActivity(NumbersLayerAccess);
            }

            ;
        });

        //end coding here
    }

    ;
};
