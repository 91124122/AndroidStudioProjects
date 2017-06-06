package com.example.palmdigital.imagebutton01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton objectImageButton01 = (ImageButton) findViewById(R.id.imageButton1);

        objectImageButton01.setOnClickListener(this);
    }

    public void  onClick(View view){
        if(view.getId() == R.id.imageButton1)
        {
            Toast.makeText(MainActivity.this, "This is an image button", Toast.LENGTH_SHORT).show();
            Log.i("info", "this is an image button");
        }
    }
}
