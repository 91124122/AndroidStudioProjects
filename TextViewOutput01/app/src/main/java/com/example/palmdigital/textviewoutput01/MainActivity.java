package com.example.palmdigital.textviewoutput01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // fields
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create references for our UI ImageViews
        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewEqualSign = (ImageView) findViewById(R.id.imageViewEqualSign);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

        // setting the references to be click listeners
        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewEqualSign.setOnClickListener(this);


    } // end of onCreate()
int num1, num2;


    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView)
        {
            textViewDisplayTop.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageViewEqualSign)
        {
            int sum = num1 + num2;
            textViewDisplayBottom.setText("" + sum);
        }
    }
}
