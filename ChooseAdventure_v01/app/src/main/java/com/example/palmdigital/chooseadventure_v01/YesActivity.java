package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class YesActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);

        Button buttonReturn = (Button)findViewById(R.id.button);
        buttonReturn.setOnClickListener(this);
        textView_story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    } // end of onCreate()
    public void onClick(View view)
    {
        if (view.getId() == R.id.button)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
    }
