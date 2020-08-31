package com.example.swandavid;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class boysaccessories extends MainActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boysaccessories);

        //Give add to cart button its function and send the product to the cart

        Button addtocart=(Button)findViewById(R.id.addtocart);
        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent=new Intent(boysaccessories.this,cart.class);
               intent.putExtra("productid", "Accessorie $8.00");

                startActivity(intent);
            }
        });

    }
}
