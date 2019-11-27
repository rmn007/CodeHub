package com.example.myapplication1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Kings extends Activity {

    public static int price[]={55, 110, 130, 10, 150};
    public static String a[]={"SHAWARMA","CHICKEN BIRIYANI","MUTTON BIRIYANI","POROTTA","BUTTER CHICKEN"};
    public static  int c[]={0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kings);
        Button b1,b2,b3,b4,b5,b6;
        TextView t;
        t=(TextView)findViewById(R.id.welcome);
        b1=(Button)findViewById(R.id.shawarma);
        b2=(Button)findViewById(R.id.cb);
        b3=(Button)findViewById(R.id.mb);
        b4=(Button)findViewById(R.id.porotta);
        b5=(Button)findViewById(R.id.butterchick);
        b6=(Button)findViewById(R.id.placeorder);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c[0]++;
                String s=Integer.toString(c[0]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c[1]++;
                String s=Integer.toString(c[1]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c[2]++;
                String s=Integer.toString(c[2]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c[3]++;
                String s=Integer.toString(c[3]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c[4]++;
                String s=Integer.toString(c[4]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent intent = new Intent(Kings.this,Placeorder.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

    }
}
