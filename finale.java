package com.example.myapplication1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class finale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finale);
        String name[]={"Arun Ghosle","Ramesh Sinha","Afsal Moozhikal"};
        int i= (int) Math.random();
        i=i%3;
        TextView t1,t2;
        t1= (TextView)findViewById(R.id.enter);
        t2= (TextView)findViewById(R.id.editText);
        t1.setText(name[2]+" IS ON HIS WAY TO PICK UP YOUR ORDER");

    }
}
