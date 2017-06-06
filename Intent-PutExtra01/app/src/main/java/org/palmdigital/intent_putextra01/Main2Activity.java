package org.palmdigital.intent_putextra01;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("STORY_SO_FAR_1");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR_1");
        }
    }
    public void next02(View view)
    {

        EditText et_adj03 = (EditText) findViewById(R.id.edit_text_adj03);
        EditText et_adj04 = (EditText) findViewById(R.id.edit_text_adj04);
        EditText et_noun03 = (EditText) findViewById(R.id.edit_text_noun03);
        EditText et_noun04 = (EditText) findViewById(R.id.edit_text_noun04);
        EditText et_number01 = (EditText) findViewById(R.id.edit_text_number01);
        EditText et_shape01 = (EditText) findViewById(R.id.edit_text_shape01);
        EditText et_food01 = (EditText) findViewById(R.id.edit_text_food01);
        EditText et_food02 = (EditText) findViewById(R.id.edit_text_food02);
        EditText et_number02 = (EditText) findViewById(R.id.edit_text_number02);



        String str_adj03 = et_adj03.getText().toString();
        String str_adj04 = et_adj04.getText().toString();
        String str_noun03 = et_noun03.getText().toString();
        String str_noun04 = et_noun04.getText().toString();
        String str_number01 = et_number01.getText().toString();
        String str_shape01 = et_shape01.getText().toString();
        String str_food01 = et_food01.getText().toString();
        String str_food02 = et_food02.getText().toString();
        String str_number02 = et_number02.getText().toString();



        newString += ".Then" + " you cover it with " + str_adj03 + " sauce, " + str_adj04
                + " cheese, and fresh" + " chopped " + str_noun03 +
                ". Next you have to bake it in a very hot " + str_noun04 + ". When it is done, cut" +
                " it into " + str_number01 + " " + str_shape01 + ". Some kids like " + str_food01 +
                " pizza the best, but my favorite is the " + str_food02 +  " pizza. If I could, I" +
                " would eat pizza " + str_number02 + " times a day!";

        Intent j = new Intent(this, Main3Activity.class);
        j.putExtra("STORY_SO_FAR_2", newString);

        startActivity(j);
    }
}
