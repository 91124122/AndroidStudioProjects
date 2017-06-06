package org.palmdigital.caesarcipherv_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void encrypt(View view)
    {
        int shift;
        // get the input from user
        EditText et_input = (EditText) findViewById(R.id.editTextMessageInput);
        String str_input = et_input.getText().toString();

        // get the shift from user
        EditText et_shift = (EditText) findViewById(R.id.editTextShiftInput);
        String str_shift = et_shift.getText().toString();
        if(str_shift.isEmpty())
        {
            shift = 0;
            Toast.makeText(this, "Please enter a shift", Toast.LENGTH_SHORT).show();
        }
        else
        {
            shift = Integer.parseInt(str_shift);
        }

        TextView tv_result = (TextView) findViewById(R.id.textViewResult);

        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // int shift = 1;
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = str_input.toUpperCase();
        for (int i = 0; i < str_input.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                    output = output + alphabet[fixedCharIndex];
                }
                // end of if statement
            } // end of inner loop
            if (str_input.charAt(i) == ' ')
            {
                output += " ";
            }
            tv_result.setText(output);
        } // end of outer for loop
    } // end of encrypt
    public void decrypt(View view)
    {
        int shift;
        // get the input from user
        EditText et_input = (EditText) findViewById(R.id.editTextMessageInput);
        String str_input = et_input.getText().toString();

        // get the shift from user
        EditText et_shift = (EditText) findViewById(R.id.editTextShiftInput);
        String str_shift = et_shift.getText().toString();
        if(str_shift.isEmpty())
        {
            shift = 0;
            Toast.makeText(this, "Please enter a shift", Toast.LENGTH_SHORT).show();
        }
        else
        {
            shift = Integer.parseInt(str_shift);
        }
        TextView tv_result = (TextView) findViewById(R.id.textViewResult);

        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // int shift = 1;
        int shiftCharIndex;
        int fixedCharIndex;
        String decryptOutput = "";
        String toUpperCase = str_input.toUpperCase();
        for (int i = 0; i < str_input.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = (j + 26) - shift;
                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                    decryptOutput = decryptOutput + alphabet[fixedCharIndex];
                }
                // end of if statement
            } // end of inner loop
            if (str_input.charAt(i) == ' ')
            {
                decryptOutput += " ";
            }
            tv_result.setText(decryptOutput);
        } // end of outer for loop
    }
} // end of class
