package com.example.biodata2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class krs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krs);

        Button home3 = (Button) findViewById(R.id.home3);
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(krs.this ,
                        home.class);
                krs.this.startActivity(intentMain);
            }
        });

        Button biodata3 = (Button) findViewById(R.id.biodata3);
        biodata3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(krs.this ,
                        biodata.class);
                krs.this.startActivity(intentMain);
            }
        });
    }
}