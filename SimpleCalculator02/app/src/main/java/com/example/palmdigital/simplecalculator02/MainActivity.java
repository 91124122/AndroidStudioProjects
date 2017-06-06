package com.example.palmdigital.simplecalculator02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;
    ImageView imageViewPlusSign;
    ImageView imageViewMinusSign;
    ImageView imageViewEqualSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum0 = (ImageView) findViewById(R.id.imageView0);
        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageViewNum9 = (ImageView) findViewById(R.id.imageView9);
        imageViewPlusSign = (ImageView) findViewById(R.id.imageViewPlus);
        imageViewMinusSign = (ImageView) findViewById(R.id.imageViewMinus);
        imageViewEqualSign = (ImageView) findViewById(R.id.imageViewEquals);
        ImageView imageViewNum20 = (ImageView) findViewById(R.id.imageView20);
        ImageView imageViewNum21 = (ImageView) findViewById(R.id.imageView21);
        ImageView imageViewNum22 = (ImageView) findViewById(R.id.imageView22);
        ImageView imageViewNum23 = (ImageView) findViewById(R.id.imageView23);
        ImageView imageViewNum24 = (ImageView) findViewById(R.id.imageView24);
        ImageView imageViewNum25 = (ImageView) findViewById(R.id.imageView25);
        ImageView imageViewNum26 = (ImageView) findViewById(R.id.imageView26);
        ImageView imageViewNum27 = (ImageView) findViewById(R.id.imageView27);
        ImageView imageViewNum28 = (ImageView) findViewById(R.id.imageView28);
        ImageView imageViewNum29 = (ImageView) findViewById(R.id.imageView29);

        textViewDisplayTop = (TextView) findViewById(R.id.textViewDisplayTop);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textViewDisplayMiddle);
        textViewDisplayBottom = (TextView) findViewById(R.id.textViewDisplayBottom);

        imageViewNum0.setOnClickListener(this);
        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewNum7.setOnClickListener(this);
        imageViewNum8.setOnClickListener(this);
        imageViewNum9.setOnClickListener(this);
        imageViewPlusSign.setOnClickListener(this);
        imageViewMinusSign.setOnClickListener(this);
        imageViewEqualSign.setOnClickListener(this);
        imageViewNum20.setOnClickListener(this);
        imageViewNum21.setOnClickListener(this);
        imageViewNum22.setOnClickListener(this);
        imageViewNum23.setOnClickListener(this);
        imageViewNum24.setOnClickListener(this);
        imageViewNum25.setOnClickListener(this);
        imageViewNum26.setOnClickListener(this);
        imageViewNum27.setOnClickListener(this);
        imageViewNum28.setOnClickListener(this);
        imageViewNum29.setOnClickListener(this);

    }
    int num1, num2;
    int sum;
    int operator;
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView0){
            textViewDisplayTop.setText("0");
            num1 = 0;
        } else if (view.getId() == R.id.imageView1)
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
            textViewDisplayTop.setText("4");
            num1 = 4;
        }
        else if(view.getId() == R.id.imageView5)
        {
            textViewDisplayTop.setText("5");
            num1 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewDisplayTop.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textViewDisplayTop.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.imageView8)
        {
            textViewDisplayTop.setText("8");
            num1 = 8;
        }
        else if (view.getId() == R.id.imageView9)
        {
            textViewDisplayTop.setText("9");
            num1 = 9;
        }
        if(view.getId() == R.id.imageView20)
        {
            textViewDisplayMiddle.setText("0");
            num2 = 0;
        }
        else if (view.getId() == R.id.imageView21)
        {
            textViewDisplayMiddle.setText("1");
            num2 = 1;
        }
        else if (view.getId() == R.id.imageView22)
        {
            textViewDisplayMiddle.setText("2");
            num2 = 2;
        }
        else if (view.getId() == R.id.imageView23)
        {
            textViewDisplayMiddle.setText("3");
            num2 = 3;
        }
        else if (view.getId() == R.id.imageView24)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView25)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView26)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView27)
        {
            textViewDisplayMiddle.setText("7");
            num2 = 7;
        }
        else if (view.getId() == R.id.imageView28)
        {
            textViewDisplayMiddle.setText("8");
            num2 = 8;
        }
        else if (view.getId() == R.id.imageView29)
        {
            textViewDisplayMiddle.setText("9");
            num2 = 9;
        }
        else if (view.getId() == R.id.imageViewPlus)
        {
            sum = num1 + num2;
            imageViewPlusSign.setBackgroundColor(0xffff00ff);
            imageViewMinusSign.setBackgroundColor(0xffffffff);
            operator = 0;
        }
        else if (view.getId() == R.id.imageViewMinus)
        {
            sum = num1 - num2;
            imageViewMinusSign.setBackgroundColor(0xffff00ff);
            imageViewPlusSign.setBackgroundColor(0xffffffff);
            operator = 1;
        }
        else if (view.getId() == R.id.imageViewEquals)
        {
            textViewDisplayBottom.setText("" + sum);
            if(operator == 0)
            {
               textViewDisplayBottom.setText("" + (num1 + num2));
            }
            else if(operator == 1)
            {
                textViewDisplayBottom.setText("" + (num1 - num2));
            }
        }
    }
}
