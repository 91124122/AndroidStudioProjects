package com.example.palmdigital.buttonn01;

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

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton1);
        buttonObject1.setText("Button 1");

        buttonObject1.setOnClickListener(this);
    } // end of onCreate method
    public void onClick(View view)
    {
        Log.i("info", "Hey you pressed Button1!!!!!!");
        Toast.makeText(this, "Hey you pressed Button1!!!!!", Toast.LENGTH_LONG).show();

    }
}
