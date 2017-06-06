package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener
{
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
        textView_question.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");

        leftButton = (Button) findViewById(R.id.button_left);
        rightButton = (Button) findViewById(R.id.button_right);

        leftButton.setText("Yes");
        rightButton.setText("HECK YES");

        // set clickListeners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
    } // end of onCreate()

    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            // yes
            // send them to the Wake up activity
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        } // explore
        else if (view.getId() == R.id.button_right)
        {
            // send user to explore activity
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        }
    } // end of onClick()
    }

