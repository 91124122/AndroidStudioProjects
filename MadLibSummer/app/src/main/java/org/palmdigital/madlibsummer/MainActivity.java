package org.palmdigital.madlibsummer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void makeStory(View view)
    {
        EditText name01 = (EditText)findViewById(R.id.editTextPersonName01); // name
        TextView tv_story = (TextView) findViewById(R.id.textViewStory);

        String story01 = "Last summer, my mom and dad took me and ";
        String story_Name01 = name01.getText().toString();
        story01 = story01 + story_Name01;

        tv_story.setText(story01);


        EditText place01 = (EditText)findViewById(R.id.editTextPlace01); // place
        String story02 = story01 + " on a trip to ";
        String story_Place01 = place01.getText().toString();
        story02 = story02 + story_Place01;

        tv_story.setText(story02);

        EditText adj01 = (EditText)findViewById(R.id.editTextAdjective01); // adjective
        String story03 = story02 + ". The weather there is very ";
        String story_Adjective01 = adj01.getText().toString();
        story03 = story03 + story_Adjective01;

        tv_story.setText(story03);

        EditText place02 = (EditText)findViewById(R.id.editTextPlace02); // place
        String story04 = story03 + "! Northern ";
        String story_Place02 = place02.getText().toString();
        story04 = story04 + story_Place02;

        tv_story.setText(story04);

        EditText noun01 = (EditText)findViewById(R.id.editTextNoun01); // noun
        String story05 = story04 + " has many ";
        String story_Noun01 = noun01.getText().toString();
        story05 = story05 + story_Noun01;

        tv_story.setText(story05);

        EditText adj02 = (EditText)findViewById(R.id.editTextAdjective02); // adjective
        String story06 = story05 + ", and they make ";
        String story_Adjective02 = adj02.getText().toString();
        story06 = story06 + story_Adjective02;

        tv_story.setText(story06);

        EditText noun02 = (EditText)findViewById(R.id.editTextNoun02); // noun
        String story07 = story06 + " ";
        String story_Noun02 = noun02.getText().toString();
        story07 = story07 + story_Noun02;

        tv_story.setText(story07);

        EditText place03 = (EditText)findViewById(R.id.editTextPlace03); // place
        String story08 = story07 + " there. Many people also go to ";
        String story_Place03 = place03.getText().toString();
        story08 = story08 + story_Place03;

        tv_story.setText(story08);

        EditText verb01 = (EditText)findViewById(R.id.editTextVerb01); // verb
        String story09 = story08 + " to ";
        String story_Verb01 = verb01.getText().toString();
        story09 = story09 + story_Verb01;

        tv_story.setText(story09);

        EditText noun03 = (EditText)findViewById(R.id.editTextNoun03); // noun
        String story10 = story09 + " or see the ";
        String story_Noun03 = noun03.getText().toString();
        story10 = story10 + story_Noun03;

        tv_story.setText(story10); //period

        String story11 = story10 + ".";
        tv_story.setText(story11);

    }
}