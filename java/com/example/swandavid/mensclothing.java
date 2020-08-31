package com.example.swandavid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mensclothing extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensclothing);

        //Make each button send the user to the correct activity for each product

        Button shirts = (Button)findViewById(R.id.addtocart);
        shirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mensclothing.this,mensshirts.class);
                startActivity(intent);
            }
        });

        Button pants = (Button)findViewById(R.id.pants);
        pants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mensclothing.this,menspants.class);
                startActivity(intent);
            }
        });

        Button jackets = (Button)findViewById(R.id.jackets);
        jackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mensclothing.this,mensjackets.class);
                startActivity(intent);
            }
        });

        Button shoes = (Button)findViewById(R.id.shoes);
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mensclothing.this,mensshoes.class);
                startActivity(intent);
            }
        });

        Button accessories = (Button)findViewById(R.id.accessories);
        accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mensclothing.this,mensaccessories.class);
                startActivity(intent);
            }
        });

    }
}
