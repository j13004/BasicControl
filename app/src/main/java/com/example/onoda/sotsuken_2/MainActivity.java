package com.example.onoda.sotsuken_2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int scoreResult[] ={75,40,45,80,90};
    int teamScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<scoreResult.length;i++) {
            if (scoreResult[i] > 50) {
                teamScore += 3;
            } else {
                teamScore += 1;
            }
        }
        textView=(TextView)findViewById(R.id.textView2);
        textView.setTextColor(Color.BLACK);
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "meiryo.ttc"));
        textView.setText("チームの点数は" + Integer.toString(teamScore));
    }
}
