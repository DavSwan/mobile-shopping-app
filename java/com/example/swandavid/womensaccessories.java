package com.example.swandavid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class womensaccessories extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womensaccessories);

        //Give add to cart button its function and send the product to the cart

        Button addtocart=(Button)findViewById(R.id.addtocart);

        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(womensaccessories.this,cart.class);
                startActivity(intent);
            }
        });

    }
}
