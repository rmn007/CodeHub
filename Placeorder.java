package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Placeorder extends AppCompatActivity {
    int pri=0;
    String fin,pric=null;
    int k=1;
    public static String amount=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeorder);
        TextView t[] = new TextView[12];
        TextView t1,t2,t3;
        Button b1,b2;
        b1 = (Button)findViewById(R.id.change);
        b2 = (Button)findViewById(R.id.confirm);
        t[1] = (TextView)findViewById(R.id.order);
        t[2] = (TextView)findViewById(R.id.one);
        t[3] = (TextView)findViewById(R.id.two);
        t[4] = (TextView)findViewById(R.id.three);
        t[5] = (TextView)findViewById(R.id.four);
        t[6] = (TextView)findViewById(R.id.five);
        t[7] = (TextView)findViewById(R.id.six);
        t[8] = (TextView)findViewById(R.id.seven);
        t[9] = (TextView)findViewById(R.id.eight);
        t[10] = (TextView)findViewById(R.id.nine);
        t[11] = (TextView)findViewById(R.id.ten);
        t1=(TextView)findViewById(R.id.amt);
        t2=(TextView)findViewById(R.id.gst);
        t3=(TextView)findViewById(R.id.fin);
        for (int i = 0; i < 5; i++) {
            if (Kings.c[i]!= 0) {
                pri += Kings.c[i]*Kings.price[i];
                fin = Kings.a[i]+ " * " +Integer.toString(Kings.c[i]);
                k++;
            }
            t[k].setText(fin);
        }
        for (int i = 0; i < 5; i++) {
            if (Alibaba.c2[i]!= 0) {
                pri += Alibaba.c2[i]*Alibaba.price2[i];
                fin = Alibaba.a2[i]+ " * " +Integer.toString(Alibaba.c2[i]);
                k++;
            }
            t[k].setText(fin);
        }
        pric=Integer.toString(pri);
        t1.setText("Total Amount = "+pric);
        double gst=0.08*pri;
        String g=Double.toString(gst);
        t2.setText("GST(8%) = "+g);
        double am=pri+gst;
        amount=Double.toString(am);
        t3.setText("Final Amount = "+amount);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(Placeorder.this,restaurantselect.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(Placeorder.this,address.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}