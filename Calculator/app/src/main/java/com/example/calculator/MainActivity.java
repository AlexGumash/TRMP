package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;

import static java.lang.Float.parseFloat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonDEL;
    Button buttonC;
    Button buttonPlus;
    Button buttonMUL;
    Button buttonDIV;
    Button buttonMIN;
    Button buttonDot;
    Button buttonEqual;

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDEL = findViewById(R.id.buttonDEL);
        buttonC = findViewById(R.id.buttonC);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMIN = findViewById(R.id.buttonMIN);
        buttonDIV = findViewById(R.id.buttonDIV);
        buttonMUL = findViewById(R.id.buttonMUL);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonDot = findViewById(R.id.buttonDot);
        editText = findViewById(R.id.editText2);


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMIN.setOnClickListener(this);
        buttonDIV.setOnClickListener(this);
        buttonMUL.setOnClickListener(this);
        buttonDEL.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        float num1 = 0;
        float num2 = 0;

        float result = 0;

        if (v.getId() == R.id.buttonPlus) {
            editText.setText(editText.getText().toString() + "+");
        }
        if (v.getId() == R.id.buttonMIN) {
            editText.setText(editText.getText().toString() + "-");
        }
        if (v.getId() == R.id.buttonDIV) {
            editText.setText(editText.getText().toString() + "/");
        }
        if (v.getId() == R.id.buttonMUL) {
            editText.setText(editText.getText().toString() + "*");
        }

        if (v.getId() == R.id.buttonEqual){
            int operation = 0;
            String text = editText.getText().toString();
            char[] temp = text.toCharArray();
            for (int i = 0; i < text.length(); i++) {
                if (temp[i] == '+'){
                    operation = 0;
                }
                if (temp[i] == '-'){
                    operation = 1;
                }
                if (temp[i] == '*'){
                    operation = 2;
                }
                if (temp[i] == '/'){
                    operation = 3;
                }
            }
            String[] text2 = text.split("[-+*/]");
            num1 = Float.parseFloat(text2[0]);
            num2 = Float.parseFloat(text2[1]);
            switch (operation) {
                case 0:
                    result = num1 + num2;
                    break;
                case 1:
                    result = num1 - num2;
                    break;
                case 2:
                    result = num1 * num2;
                    break;
                case 3:
                    result = num1 / num2;
                    break;
            }
            editText.setText(Float.toString(result));
        }

        switch (v.getId()){
            case R.id.buttonC: editText.setText("");break;
            case R.id.buttonDEL:
                String str = editText.getText().toString();
                if (str.length() != 0) {
                    editText.setText(str.substring(0,str.length() - 1));
                }
                break;
            case R.id.button0: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button1: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button2: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button3: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button4: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button5: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button6: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button7: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button8: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.button9: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            case R.id.buttonDot: editText.setText(editText.getText() + ((Button) findViewById(v.getId())).getText().toString());break;
            default: break;
        }

    }
}
