package com.example.swandavid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //create top menu so user can go directly to cart or main clothing directory

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cart:
                Intent intent = new Intent(MainActivity.this, cart.class);
                startActivity(intent);
                return true;

            case R.id.womens:
                Intent i= new Intent(MainActivity.this, womensclothing.class);
                startActivity(i);
            return true;

            case R.id.mens:
                Intent h=new Intent(MainActivity.this, mensclothing.class);
                startActivity(h);
                return true;

            case R.id.girls:
                Intent b=new Intent(MainActivity.this, girlsclothing.class);
                startActivity(b);
                return true;

            case R.id.boys:
                Intent c=new Intent(MainActivity.this, boysclothing.class);
                startActivity(c);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Give each button its destination when the user clicks on it

        Button womens = (Button)findViewById(R.id.womens);
        womens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,womensclothing.class);
                startActivity(intent);
            }
        });

        Button mens = (Button)findViewById(R.id.mens);
        mens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,mensclothing.class);
                startActivity(intent);
            }
        });

        Button boys = (Button)findViewById(R.id.boys);
        boys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,boysclothing.class);
                startActivity(intent);
            }
        });


        Button girls = (Button)findViewById(R.id.girls);
        girls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,girlsclothing.class);
                startActivity(intent);
            }
        });

    }
}
