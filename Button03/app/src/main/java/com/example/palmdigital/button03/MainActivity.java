package com.example.palmdigital.button03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button)findViewById(R.id.buttonMyButton1);
        buttonObject01.setText("The Blue Pill");
        buttonObject01.setOnClickListener(this);
        buttonObject01.setBackgroundColor(0xff0000ff);
        //change bottom margin on button01

        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton2);
        buttonObject02.setText("The Red Pill");
        buttonObject02.setOnClickListener(this);
        buttonObject02.setBackgroundColor(0xffff0000);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonMyButton1)
        {
           Toast.makeText(MainActivity.this, "I'm the blue pill ", Toast.LENGTH_SHORT).show();
            Log.i("info", "I'm the blue pill");
        }
       else
        {
            Toast.makeText(MainActivity.this, "I'm the red pill", Toast.LENGTH_SHORT).show();
            Log.i("info", "I'm the red pill");
        }

    }
}