package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private TextView textViewColor;

    private SeekBar sk1,sk2,sk3;

    private TextView rT,gT,bT, final_color;

    private  int r,g,b;



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        sk1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean s) {
                rT.setText("Red: "+i);
                r=i;
                final_color.setText("("+r+","+g+","+b+")");
                final_color.setBackgroundColor(Color.rgb(r,g,b));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sk2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean s) {
               gT.setText("Green: "+i);
                g=i;
                final_color.setText("("+r+","+g+","+b+")");
                final_color.setBackgroundColor(Color.rgb(r,g,b));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sk3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean s) {
                bT.setText("Blue: "+i);
                b=i;
                final_color.setText("("+r+","+g+","+b+")");
                final_color.setBackgroundColor(Color.rgb(r,g,b));
                final_color.setTextColor(Color.WHITE);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void init(){
        sk1=findViewById(R.id.sk1);
        sk2=findViewById(R.id.sk2);
        sk3=findViewById(R.id.sk3);
        rT=findViewById(R.id.rT);
        gT=findViewById(R.id.gT);
        bT=findViewById(R.id.bT);
        final_color=findViewById(R.id.final_color);
        r=0;
        g=0;
        b=0;
    }
}