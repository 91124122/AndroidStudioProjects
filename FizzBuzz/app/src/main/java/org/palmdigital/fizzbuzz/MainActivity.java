package org.palmdigital.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        EditText editText01 = (EditText)findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);
        String editText = editText01.getText().toString();
        int i = Integer.parseInt(editText);
        TextView tv_result = (TextView) findViewById(R.id.textView2);
        if (i % 3 == 0 && i % 5 == 0)
        {
            tv_result.setText("FizzBuzz");
        }
        else if (i % 3 == 0)
        {
            tv_result.setText("Fizz");
        }
        else if (i % 5 == 0)
        {
            tv_result.setText("Buzz");
        }
        else
        {
            tv_result.setText(editText);
        }
    }
}
