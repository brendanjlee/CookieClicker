package com.example.cookieclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//This is a test

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    Button count_button;
    TextView score_text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count_button = (Button) findViewById(R.id.button1);
        score_text = (TextView) findViewById(R.id.tx);

        count_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter ++;
                score_text.setText(Integer.toString(counter));
            }
        });
    }
}
