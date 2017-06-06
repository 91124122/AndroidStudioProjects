package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WakeUpActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        // references

        // TextViews
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);

        textView_story.setText("You wake up and have a boring day. The end.");

        Button buttonReturn = (Button) findViewById(R.id.buttonReturn);
        buttonReturn.setOnClickListener(this);
        buttonReturn.setText("Return");
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonReturn)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
