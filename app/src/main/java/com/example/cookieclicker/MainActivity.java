package com.example.cookieclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//This is a test

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private int highscore = 0;
    Button count_button;
    TextView score_text;
    TextView high_text;

    //did this work?




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count_button = (Button) findViewById(R.id.button1);
        score_text = (TextView) findViewById(R.id.score_count);
        high_text =  (TextView) findViewById(R.id.high_score);

        count_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter ++;
                score_text.setText(Integer.toString(counter));

                if(counter > highscore){
                    highscore ++;
                    high_text.setText("High Score: " + Integer.toString(counter));
                }

                if(counter == 69){
                    score_text.setText("Nice");
                    score_text.setTextColor(Color.parseColor("#b48e0c"));
                }
                if (counter < 100 && counter >= 50 && counter != 69) {
                    score_text.setTextColor(Color.parseColor("#216dc9"));
                    high_text.setTextColor(Color.parseColor("#216dc9"));
                }
                if (counter >= 100) {
                    score_text.setTextColor(Color.parseColor("#b62f13"));
                    high_text.setTextColor(Color.parseColor("#b62f13"));
                }


            }
        });
    }
}
//hi