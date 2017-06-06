package org.palmdigital.intent_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
        String story;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end of onCreate()

    public void next01(View view)
    {
        //references
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_nationality01 = (EditText) findViewById(R.id.edit_text_nationality01);
        EditText et_name01 = (EditText) findViewById(R.id.edit_text_person01);
        EditText et_noun01 = (EditText) findViewById(R.id.edit_text_noun01);
        EditText et_adj02 = (EditText) findViewById(R.id.edit_text_adj02);
        EditText et_noun02 = (EditText) findViewById(R.id.edit_text_noun02);


        String str_adj01 = et_adj01.getText().toString();
        String str_nationality01 = et_nationality01.getText().toString();
        String str_name01 = et_name01.getText().toString();
        String str_noun01 = et_noun01.getText().toString();
        String str_adj02 = et_adj02.getText().toString();
        String str_noun02 = et_noun02.getText().toString();



        story = "Pizza was invented by a " + str_adj01 + " " + str_nationality01
                + " chef named " + str_name01 + "." + " To make a pizza, you need to take a lump of "
                + str_noun01 + ", and make a thin, round " + str_adj02 + " " + str_noun02;

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR_1", story);

        startActivity(i);
    }
} // end of class
