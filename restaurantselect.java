package com.example.myapplication1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class restaurantselect extends Activity {
    Button b1,b2;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantselect);
        b1 = (Button)findViewById(R.id.kings);
        b2 = (Button)findViewById(R.id.alibaba);
        t= (TextView)findViewById(R.id.question);
        t.setText("CHOOSE RESTAURANT");
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(restaurantselect.this,Kings.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(restaurantselect.this,Alibaba.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
