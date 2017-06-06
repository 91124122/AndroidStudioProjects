package org.palmdigital.intent_putextra01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
    // fields
    String newString2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //references
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString2 = null;
            }
            else
            {
                newString2 = extras.getString("STORY_SO_FAR_2");
            }
        }
        else
        {
            newString2 = (String) savedInstanceState.getSerializable("STORY_SO_FAR_2");
        }

        tv_story.setText(newString2);
    }
}