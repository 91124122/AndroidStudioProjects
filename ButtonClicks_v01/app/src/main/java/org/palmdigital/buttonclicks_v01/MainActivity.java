package org.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button button = (Button) findViewById(R.id.button);
    }
    public void getName(View n)
    {
        Toast.makeText(MainActivity.this, "This button works", Toast.LENGTH_SHORT).show();
    }
    public void getLastName(View z)
    {
        Toast.makeText(MainActivity.this, "Testing second button", Toast.LENGTH_SHORT).show();

    }
    public void getPetName(View dog)
    {
        Toast.makeText(MainActivity.this, "Testing third button", Toast.LENGTH_SHORT).show();

    }

}
