package com.example.palmdigital.imageview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewObject01 = (ImageView) findViewById(R.id.imageView01);
        ImageView imageViewObject02 = (ImageView) findViewById(R.id.imageView02);
        ImageView imageViewObject03 = (ImageView) findViewById(R.id.imageView03);

        imageViewObject01.setOnClickListener(this);
        imageViewObject02.setOnClickListener(this);
        imageViewObject03.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId() == (R.id.imageView01))
        {
            Toast.makeText(MainActivity.this, "Contacts", Toast.LENGTH_SHORT).show();
            Log.i("info", "Contacts");
        }
        else if (view.getId() == (R.id.imageView02)){
            Toast.makeText(MainActivity.this, "Email", Toast.LENGTH_SHORT).show();
            Log.i("info", "Email");
        }
        else if(view.getId() == (R.id.imageView03)){
            Toast.makeText(MainActivity.this, "Message", Toast.LENGTH_SHORT).show();
            Log.i("info", "Message");
        }
    }
}
