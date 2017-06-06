package com.example.palmdigital.simplecalc04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;
    ImageView imageViewPlus;
    ImageView imageViewMinus;
    ImageView imageViewMultiply;
    ImageView imageViewDivide;
    ImageView imageViewEqualSign;
    ImageView imageViewClear;
    int num1;
    float num2;
    int result;
    int operator;


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
        imageViewPlus = (ImageView) findViewById(R.id.imageViewPlus);
        imageViewMinus = (ImageView) findViewById(R.id.imageViewMinus);
        imageViewMultiply = (ImageView) findViewById(R.id.imageViewMultiply);
        imageViewDivide = (ImageView) findViewById(R.id.imageViewDivision);
        imageViewEqualSign = (ImageView) findViewById(R.id.imageViewEqualSign);
        imageViewClear = (ImageView) findViewById(R.id.imageViewClear);
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

        textViewViewDisplayTop = (TextView) findViewById(R.id.textViewTop);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textViewMiddle);
        textViewDisplayBottom = (TextView) findViewById(R.id.textViewBottom);

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
        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
        imageViewMultiply.setOnClickListener(this);
        imageViewDivide.setOnClickListener(this);
        imageViewEqualSign.setOnClickListener(this);
        imageViewNum20.setOnClickListener(this);
        imageViewNum21.setOnClickListener(this);
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
    public void onClick(View view) {
        if (view.getId() == R.id.imageView0) {
            num1 = 0;
            textViewViewDisplayTop.setText("0");
        } else if (view.getId() == R.id.imageView1) {
            num1 = 1;
            textViewViewDisplayTop.setText("1");
        } else if (view.getId() == R.id.imageView2) {
            num1 = 2;
            textViewViewDisplayTop.setText("2");
        } else if (view.getId() == R.id.imageView3) {
            num1 = 3;
            textViewViewDisplayTop.setText("3");
        } else if (view.getId() == R.id.imageView4) {
            num1 = 4;
            textViewViewDisplayTop.setText("4");
        } else if (view.getId() == R.id.imageView5) {
            num1 = 5;
            textViewViewDisplayTop.setText("5");
        } else if (view.getId() == R.id.imageView6) {
            num1 = 6;
            textViewViewDisplayTop.setText("6");
        } else if (view.getId() == R.id.imageView7) {
            num1 = 7;
            textViewViewDisplayTop.setText("7");
        } else if (view.getId() == R.id.imageView8) {
            num1 = 8;
            textViewViewDisplayTop.setText("8");
        } else if (view.getId() == R.id.imageView9) {
            num1 = 9;
            textViewViewDisplayTop.setText("9");
        } else if (view.getId() == R.id.imageView20) {
            num2 = 0;
            textViewDisplayMiddle.setText("0");
        } else if (view.getId() == R.id.imageView21) {
            num2 = 1;
            textViewDisplayMiddle.setText("1");
        } else if (view.getId() == R.id.imageView22) {
            num2 = 2;
            textViewDisplayMiddle.setText("2");
        } else if (view.getId() == R.id.imageView23) {
            num2 = 3;
            textViewDisplayMiddle.setText("3");
        } else if (view.getId() == R.id.imageView24) {
            num2 = 4;
            textViewDisplayMiddle.setText("4");
        } else if (view.getId() == R.id.imageView25) {
            num2 = 5;
            textViewDisplayMiddle.setText("5");
        } else if (view.getId() == R.id.imageView26) {
            num2 = 6;
            textViewDisplayMiddle.setText("6");
        } else if (view.getId() == R.id.imageView27) {
            num2 = 7;
            textViewDisplayMiddle.setText("7");
        } else if (view.getId() == R.id.imageView28) {
            num2 = 8;
            textViewDisplayMiddle.setText("8");
        } else if (view.getId() == R.id.imageView29) {
            num2 = 9;
            textViewDisplayMiddle.setText("9");
        } else if (view.getId() == R.id.imageViewPlus) {
            switchBackground(1);
            operator = 0;
        } else if (view.getId() == R.id.imageViewMinus) {
            switchBackground(2);
            operator = 1;
        } else if(view.getId() == R.id.imageViewMultiply) {
            switchBackground(3);
            operator = 2;
        }else if(view.getId() == R.id.imageViewDivision) {
            switchBackground(4);
            operator = 3;
        } else if(view.getId() == R.id.imageViewClear)
        {

        }
        else if (view.getId() == R.id.imageViewEqualSign) {
            textViewDisplayBottom.setText("" + result);
            if(operator == 0)
            {
                textViewDisplayBottom.setText("" + (num1 + num2));
            }
            else if(operator == 1)
            {
                textViewDisplayBottom.setText("" + (num1 - num2));
            }
            else if(operator == 2)
            {
                textViewDisplayBottom.setText("" + (num1 * num2));
            } else if(operator == 3)
            {
                textViewDisplayBottom.setText("" + (num1 / num2));
                divideZero();
            }
        }
    }

    public void switchBackground(int op) {
        if (op == 1) {
            imageViewPlus.setBackgroundColor(0xffff00ff);
            imageViewMinus.setBackgroundColor(0xffffffff);
            imageViewMultiply.setBackgroundColor(0xffffffff);
            imageViewDivide.setBackgroundColor(0xffffffff);
        } else if (op == 2)
        {
            imageViewMinus.setBackgroundColor(0xffff00ff);
            imageViewPlus.setBackgroundColor(0xffffffff);
            imageViewMultiply.setBackgroundColor(0xffffffff);
            imageViewDivide.setBackgroundColor(0xffffffff);
        }
        else if (op == 3)
        {
            imageViewMultiply.setBackgroundColor(0xffff00ff);
            imageViewPlus.setBackgroundColor(0xffffffff);
            imageViewMinus.setBackgroundColor(0xffffffff);
            imageViewDivide.setBackgroundColor(0xffffffff);
        }
        else if (op == 4)
        {
            imageViewDivide.setBackgroundColor(0xffff00ff);
            imageViewPlus.setBackgroundColor(0xffffffff);
            imageViewMultiply.setBackgroundColor(0xffffffff);
            imageViewMinus.setBackgroundColor(0xffffffff);
        }

    }
    public void divideZero(){
        if(num1 == 0 || num2 == 0)
        {
            textViewDisplayBottom.setText("error");
        }
    }
}
