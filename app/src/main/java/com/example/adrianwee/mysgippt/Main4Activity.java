package com.example.adrianwee.mysgippt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView a0 = (ImageView) findViewById(R.id.imageView1);
        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        ImageView a1 = (ImageView) findViewById(R.id.imageView2);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this, "Click Running Man To Back Home Screen", Toast.LENGTH_LONG).show();
            }
        });
    }
}
