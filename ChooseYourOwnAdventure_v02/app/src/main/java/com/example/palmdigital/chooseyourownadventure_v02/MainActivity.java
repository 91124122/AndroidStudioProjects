package com.example.palmdigital.chooseyourownadventure_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button leftButton;
    Button rightButton;
    TextView textViewStory;
    TextView textViewQuestion;
    int operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         leftButton = (Button) findViewById(R.id.button_left);
         rightButton = (Button) findViewById(R.id.button_right);

        textViewStory = (TextView) findViewById(R.id.textView_story);
        textViewQuestion = (TextView) findViewById(R.id.textView_question);

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
    }
    public void onClick(View view)
    {

    }
    public void mainScreen() {
        textViewStory.setText("One morning the Tortoise woke up in a dream"); // green
        textViewQuestion.setText("Do you want to 'wake up' or 'explore' the dream?");
        leftButton.setText("wake up");
        rightButton.setText("explore");
    }
    public void wakeUp() {
        textViewStory.setText("You wake up and have a boring day. The End.");
        textViewQuestion.setText("");
    }
    public void explore() {
        textViewStory.setText("You approach a glowing green bucket of ooze. " +
                "Worried that you will get in trouble, you pick up the bucket." );
        textViewQuestion.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
        leftButton.setText("backyard");  // cyan
        rightButton.setText("toilet");
    }
    public void backyard() {
        textViewStory.setText("As you walk into the backyard a net scoops you up and a giant takes" +
                "you to a boiling pot of water." );
        textViewQuestion.setText("As the man starts to prepare you as soup, do you... 'Scream' or " +
                "'Faint'?");
        leftButton.setText("scream");  // orange
        rightButton.setText("faint");
    }
    public void scream() {
       mainScreen();
    }
    public void faint() {
        textViewStory.setText("You made a delicious soup! Yum! The end." );
        textViewQuestion.setText("");
        leftButton.setText("The end.");
        rightButton.setText("red color code"); //red
    }
    public void toilet() {
        textViewStory.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes" +
                "covering you in radioactive waste." );
        textViewQuestion.setText("Do you want to train to be a NINJA? 'Yes' or 'HECK YES'?");
        leftButton.setText("yes");
        rightButton.setText("HECK YES");
    }
    public void yes() {
        textViewStory.setText("Awesome dude! You live out the rest of your life fighting crimes and" +
                "eating pizza!" );
        textViewQuestion.setText("");
        leftButton.setText("The end.");
        rightButton.setText("yellow color code"); // yellow
    }
    public void heckYes() {
        textViewStory.setText("Awesome dude! You live out the rest of your life fighting crimes and" +
                "eating pizza!" );
        textViewQuestion.setText("");
        leftButton.setText("The end.");
        rightButton.setText("yellow color code"); // yellow
    }

}
