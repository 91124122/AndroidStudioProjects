package com.example.palmdigital.buttonchallenge1;

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

        Button objectButton1 = (Button) findViewById(R.id.buttonMyButton1);
        Button objectButton2 = (Button) findViewById(R.id.buttonMyButton2);
        Button objectButton3 = (Button) findViewById(R.id.buttonMyButton3);

        objectButton1.setText("Contacts");
        objectButton2.setText("Email");
        objectButton3.setText("Messages");

        objectButton1.setBackgroundColor(0xff00ffff);
        objectButton2.setBackgroundColor(0xffff00ff);
        objectButton3.setBackgroundColor(0xff888888);

        objectButton1.setOnClickListener(this);
        objectButton2.setOnClickListener(this);
        objectButton3.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonMyButton1)
        {
            Toast.makeText(MainActivity.this, "You selected Contacts", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Contacts");
        }
        else if (view.getId() == R.id.buttonMyButton2)
        {
        Toast.makeText(MainActivity.this, "You selected Email", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Email");
        }
        else if (view.getId() == R.id.buttonMyButton3){
        Toast.makeText(MainActivity.this, "You selected Messages", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Messages");

        }

    }

}
