package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Alibaba extends AppCompatActivity {
    public static int price2[]={60,110,130,15,80};
    public static String a2[]={"CHICKEN KEBAB-2PC","PANEER BUTTER MASALA","CHICKEN NOODLES","LIME JUICE","BEEF ROAST"};
    public static int c2[]={0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alibaba);
        Button b1,b2,b3,b4,b5,b6;
        TextView t;
        t=(TextView)findViewById(R.id.welcome);
        b1=(Button)findViewById(R.id.kebab);
        b2=(Button)findViewById(R.id.cb);
        b3=(Button)findViewById(R.id.cn);
        b4=(Button)findViewById(R.id.porotta);
        b5=(Button)findViewById(R.id.bf);
        b6=(Button)findViewById(R.id.placeorder);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c2[0]++;
                String s=Integer.toString(c2[0]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c2[1]++;
                String s=Integer.toString(c2[1]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c2[2]++;
                String s=Integer.toString(c2[2]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c2[3]++;
                String s=Integer.toString(c2[3]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                c2[4]++;
                String s=Integer.toString(c2[4]);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent intent = new Intent(Alibaba.this,Placeorder.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

    }
}
