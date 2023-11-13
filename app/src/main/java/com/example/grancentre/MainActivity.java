package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b1){
            Intent intent = new Intent(this, Restaurants.class); //.class és l'arxiu java compilat
            startActivity(intent);
        }
        if (v.getId() == R.id.b2){
            Intent intent = new Intent(this, Hotels.class); //.class és l'arxiu java compilat
            startActivity(intent);
        }
        if (v.getId() == R.id.b3){
            Intent intent = new Intent(this, Movies.class); //.class és l'arxiu java compilat
            startActivity(intent);
        }
        if (v.getId() == R.id.b4){
            Intent intent = new Intent(this, Parkings.class); //.class és l'arxiu java compilat
            startActivity(intent);
        }
    }
}