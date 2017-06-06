package com.example.palmdigital.scope02;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 // fields
    double myDouble01;
    double myDouble02;
    double myDouble03;
    double myDouble04;
    double myDouble05;
    int myInt01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    } // end of onCreate()
    public void myAwesomeMethod01()
    {
        myInt01 = 1;
        myDouble01 = 1.1;
        String myString01 = "one";
        TextView myTextView01 = (TextView) findViewById(R.id.textView01);
        ImageView myImageView01 = (ImageView) findViewById(R.id.imageView);
        Button myButton01;
    }
    public void myAwesomeMethod02()
    {
        int myInt02 = 2;
        myDouble02 = 2.2;
        String myString02 = "two";
        TextView myTextView02 = (TextView) findViewById(R.id.textView01);
        ImageView myImageView02 = (ImageView) findViewById(R.id.imageView);
        Button myButton02;
    }
    public void myAwesomeMethod03()
    {
        int myInt03;
        myDouble03 = 3.3;
        String myString03;
        TextView myTextView03;
        ImageView myImageView03 = (ImageView) findViewById(R.id.imageView);
        Button myButton03;
    }
    public void myAwesomeMethod04()
    {
        int myInt04;
        myDouble04 = 4.4;
        String myString04;
        TextView myTextView04;
        ImageView myImageView04 = (ImageView) findViewById(R.id.imageView);
        Button myButton04;
    }
    public void myAwesomeMethod05()
    {
        int myInt05;
        myDouble05 = 5.5;
        String myString05;
        TextView myTextView05;
        ImageView myImageView05 = (ImageView) findViewById(R.id.imageView);
        Button myButton05;
    }
} // end of the MainActivity
