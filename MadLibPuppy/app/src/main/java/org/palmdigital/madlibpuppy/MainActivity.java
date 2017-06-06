package org.palmdigital.madlibpuppy;

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
         EditText color01 = (EditText)findViewById(R.id.editTextColor01); //color
        TextView tv_story = (TextView) findViewById(R.id.textViewStory);

        String story01 = "Today I saw him again. When he looks at me with those ";
        String story_Color01 = color01.getText().toString();
        story01 = story01 + story_Color01;

        tv_story.setText(story01);


        EditText bodyPart01 = (EditText)findViewById(R.id.editBodyPart01); // body part
        String story02 = story01 + " eyes, it makes my ";
        String story_Body01 = bodyPart01.getText().toString();
        story02 = story02 + story_Body01;

        tv_story.setText(story02);


        EditText noun01 = (EditText)findViewById(R.id.editTextNoun01); // noun
        String story03 = story02 + " go pitterpat, and I feel as if I have ";
        String story_Noun01 = noun01.getText().toString();
        story03 = story03 + story_Noun01;

        tv_story.setText(story03);

        EditText verb01 = (EditText)findViewById(R.id.editTextVerb01); // verb
        String story04 = story03 + " in my stomach. When he scrunches his nose, I want to ";
        String story_Verb01 = verb01.getText().toString();
        story04 = story04 + story_Verb01;

        tv_story.setText(story04);


        EditText adj01 = (EditText)findViewById(R.id.editTextAdjective01); // adjective 01
        String story05 = story04 + " him softly. He is so ";
        String story_Adjective01 = adj01.getText().toString();
        story05 = story05 + story_Adjective01;

        tv_story.setText(story05);


        EditText adj02 = (EditText)findViewById(R.id.editTextAdjective02); // adjective 02
        String story06 = story05 + " and ";
        String story_Adjective02 = adj02.getText().toString();
        story06 = story06 + story_Adjective02;

        tv_story.setText(story06);


        EditText verb02 = (EditText)findViewById(R.id.editTextVerb02); // verb 02
        String story07 = story06 + ". Tomorrow he will be mine. For now he ";
        String story_Verb02 = verb02.getText().toString();
        story07 = story07 + story_Verb02;

        tv_story.setText(story07);

        EditText noun02 = (EditText)findViewById(R.id.editTextNoun02); // noun 02
        String story08 = story07 + " in the store ";
        String story_Noun02 = noun02.getText().toString();
        story08 = story08 + story_Noun02;

        tv_story.setText(story08);


        EditText noun03 = (EditText)findViewById(R.id.editTextNoun03); // noun 03
        String story09 = story08 + " looking at me. ";
        String story_Noun03 = noun03.getText().toString();
        story09 = story09 + story_Noun03;

        tv_story.setText(story09);

        String story10 = story09 + " love is hard to resist!";
        tv_story.setText(story10);





    }
}
