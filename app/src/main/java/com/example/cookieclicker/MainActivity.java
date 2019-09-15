package com.example.cookieclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.Random;

//This is a test

public class MainActivity extends AppCompatActivity {

    private double clickCounter = 0.00;
    private double highscore = 0.00;
    public double totalAmount = 0.00;
    private double nextClickCost = 10.00;
    private double nextAutoCost = 1.2;
    private double clickMultiply = 1.00;
    private double nextClickMultiply;
    private int autoUpgradeAmount = 0;
    public double totalAutoSec = 0;

    Button count_button;
    Button btnClickUpgrade;
    Button btnAuto;
    TextView score_text;
    TextView high_text;
    Layout layout;
    TextView letters;

    private static DecimalFormat df2 = new DecimalFormat("#.##"); // then run 'df2.format(number)'

    //did this work?


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count_button = (Button) findViewById(R.id.button1);
        btnAuto = (Button) findViewById(R.id.btnAuto);
        btnClickUpgrade = (Button) findViewById(R.id.btnClickUpgrade);
        score_text = (TextView) findViewById(R.id.score_count);
        high_text = (TextView) findViewById(R.id.high_score);
        letters = (TextView) findViewById(R.id.letters);

        count_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // when the button is pressed
                clickCounter++;
                totalAmount += clickMultiply;
                highscore += clickMultiply;
                score_text.setText(df2.format(totalAmount));
                high_text.setText("High Score: " + df2.format(highscore));

                RelativeLayout bgElement = (RelativeLayout) findViewById(R.id.layout);

                Random rand = new Random();
                Random rand2 = new Random();
                Random rand3 = new Random();
                switch (rand.nextInt(11)) {
                    case 1:
                        bgElement.setBackgroundColor(Color.WHITE);
                        break;
                    case 2:
                        bgElement.setBackgroundColor(Color.BLACK);
                        break;
                    case 3:
                        bgElement.setBackgroundColor(Color.RED);
                        break;
                    case 4:
                        bgElement.setBackgroundColor(Color.BLUE);
                        break;
                    case 5:
                        bgElement.setBackgroundColor(Color.GREEN);
                        break;
                    case 6:
                        bgElement.setBackgroundColor(Color.CYAN);
                        break;
                    case 7:
                        bgElement.setBackgroundColor(Color.DKGRAY);
                        break;
                    case 8:
                        bgElement.setBackgroundColor(Color.GRAY);
                        break;
                    case 9:
                        bgElement.setBackgroundColor(Color.LTGRAY);
                        break;
                    case 10:
                        bgElement.setBackgroundColor(Color.MAGENTA);
                        break;
                    case 0:
                        bgElement.setBackgroundColor(Color.YELLOW);

                }
                switch (rand2.nextInt(11)) {
                    case 0:
                        score_text.setTextColor(Color.YELLOW);
                        break;
                    case 1:
                        score_text.setTextColor(Color.WHITE);
                        break;
                    case 2:
                        score_text.setTextColor(Color.BLACK);
                        break;
                    case 3:
                        score_text.setTextColor(Color.RED);
                        break;
                    case 4:
                        score_text.setTextColor(Color.BLUE);
                        break;
                    case 5:
                        score_text.setTextColor(Color.GREEN);
                        break;
                    case 6:
                        score_text.setTextColor(Color.CYAN);
                        break;
                    case 7:
                        score_text.setTextColor(Color.DKGRAY);
                        break;
                    case 8:
                        score_text.setTextColor(Color.GRAY);
                        break;
                    case 9:
                        score_text.setTextColor(Color.LTGRAY);
                        break;
                    case 10:
                        score_text.setTextColor(Color.MAGENTA);
                        break;

                }
                switch (rand3.nextInt(10)) {
                    case 0:
                        count_button.setTextColor(Color.YELLOW);
                        break;
                    case 1:
                        count_button.setTextColor(Color.MAGENTA);
                        break;
                    case 2:
                        count_button.setTextColor(Color.BLACK);
                        break;
                    case 3:
                        count_button.setTextColor(Color.RED);
                        break;
                    case 4:
                        count_button.setTextColor(Color.BLUE);
                        break;
                    case 5:
                        count_button.setTextColor(Color.GREEN);
                        break;
                    case 6:
                        count_button.setTextColor(Color.CYAN);
                        break;
                    case 7:
                        count_button.setTextColor(Color.DKGRAY);
                        break;
                    case 8:
                        count_button.setTextColor(Color.GRAY);
                        break;
                    case 9:
                        count_button.setTextColor(Color.LTGRAY);
                        break;

                }





                btnClickUpgrade.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) { // when click upgrade is clicked
                        if (totalAmount >= nextClickCost) {
                            totalAmount -= nextClickCost;
                            score_text.setText(df2.format(totalAmount));
                            nextClickCost *= 1.5;
                            clickMultiply *= 1.2;
                            nextClickMultiply = clickMultiply * 1.2;
                            btnClickUpgrade.setText("Upgrade Click\nCost: " + df2.format(nextClickCost) + "\nCurrent: " + df2.format(clickMultiply) + "\nNext: " + df2.format(nextClickMultiply));


                        }


                    }

                });

            }
        });
    }

    public static double getRandomNumber(double min, double max) {
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    }


//hi