package com.example.adrianwee.mysgippt;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView ipptresult = (TextView) findViewById(R.id.ipptresult);
        final EditText pushup = (EditText) findViewById(R.id.pushup);
        final EditText situp = (EditText) findViewById(R.id.situp);

        Button button = (Button) findViewById(R.id.resultbutton);

        ImageView a0 = (ImageView) findViewById(R.id.imageView1);
        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double pushupcount = Double.parseDouble(pushup.getText().toString());
                double situpcount = Double.parseDouble(situp.getText().toString());
                double result = pushupcount + situpcount;

                String statusText;
                int statusColor;

                if (result >= 85 && result <= 999 ) {
                    statusText = "Gold!! $500 Incentive!";
                    statusColor = Color.YELLOW;
                    Toast.makeText(getApplicationContext(), "Excellent", Toast.LENGTH_LONG).show();
                } else if (result >= 75 && result < 84) {
                    statusText = "Silver!! $300 Incentive!";
                    statusColor = Color.LTGRAY;
                    Toast.makeText(getApplicationContext(), "Well Done", Toast.LENGTH_LONG).show();
                } else if (result >= 51 && result < 74) {
                    statusText = "You Pass!! $200 incentive!";
                    statusColor = Color.GREEN;
                    Toast.makeText(getApplicationContext(), "Keep It Up", Toast.LENGTH_LONG).show();
                } else {
                    statusText = "Fail! Register for RT session!";
                    statusColor = Color.RED;
                    Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_LONG).show();
                }

                ipptresult.setText(statusText);
                ipptresult.setBackgroundColor(statusColor);
            }
        });
    }
}
