package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// we are outside the MainActivity class
// we are outside any methods

// Understanding how scope works is very important!!


public class MainActivity extends AppCompatActivity
{
    // in the MainActivity class, but I'm outside any methods

    // fields - these variables have classwide scope -- any code in the class can see
    //          and use these variables
    String myString;
    // declare a field that is a double named enemyHealth
    Double enemyHealth;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here, we are inside the onCreate() method, which is inside
        // the MainActivity class

        // when we 'declare' or 'define' a variable, we use the following format:
        // dataType variableName; <--- this is a variable declaration/definition
        // Some examples:
        int myInt; // <--- this is declaring a variable of dataType 'int' and named 'myIntl'
        double myDouble; // <--- this is declaring a variable of dataType 'double' named 'myDouble'
        TextView textView_story;  // <--- this is declaring a variable of dataType 'TextView' named
                                 // 'textView_story'
        ImageView imageView_ex; // <--- dataType is ImageView, variableName is imageView_ex

        // assigning a value to a declared variable
        // after we declare a variable, we can assign a value to it
        // variableName = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        myInt = 10; // <--- setting the value of myInt to 10, myInt has dataType 'int' & 10 is an int
        myDouble = 20.12; // myDouble gets 20.12
        textView_story = (TextView) findViewById(R.id.textView_st); // set the value of
                                                                // textView_story to the UI element
                                                                // R.id.textView_st

        imageView_ex = (ImageView) findViewById(R.id.imageView_android_guy);

        // you know you can declare and assign in the same step
        // dataType variable name = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        int myInt2 = 25; // <--- this is a declaration AND assignment
        myInt2 = 50; // this is only assignment
        // THE DIFFERENCE IS the dataType!!!!!!! 'int'
        myString = "this is a string"; // <--- a declaration AND an assignment
        myString = "this is another string"; // <--- this is just assignment

        enemyHealth = 10.2; // assignment
        // !!!!!!!!!!!! Wherever you declare a variable determines that variable's scope
        // in other words, if I declare a variable here in the onCreate() method, only
        // code in the onCreate() method can see it and use it
        // nothing outside of onCreate() can see it... let's prove this...

    } // end of onCreate method

    public void myAwesomeMethod01()
    {
        myString = "what's going on here...";

        enemyHealth = 9.7; // assignment
    } // end of myAwesomeMethod01()


    public void myAwesomeMethod02()
    {
        enemyHealth = 8.3; // assignment
    } // end of myAwesomeMethod02()
} // end of class

