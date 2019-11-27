package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class address extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        TextView t;
        Button b;
        t = (TextView)findViewById(R.id.enter);
        EditText t1;
        t1 = (EditText)findViewById(R.id.editText);
        b = (Button)findViewById(R.id.payment);
        b.setText("MAKE PAYMENT OF "+Placeorder.amount);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(address.this,finale.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });


    }
}
