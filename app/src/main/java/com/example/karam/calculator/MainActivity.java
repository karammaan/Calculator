package com.example.karam.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstEditText ,secondEditText;
    private Button  addBox, minusBox, multiplyBox, divideBox;
    private TextView textBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEditText=(EditText) findViewById(R.id.first_no);

        secondEditText=(EditText) findViewById(R.id.second_no);

        addBox=(Button) findViewById(R.id.add_btn);

        minusBox=(Button) findViewById(R.id.minus_btn);

        multiplyBox=(Button) findViewById(R.id.multiply_btn);

        divideBox=(Button) findViewById(R.id.divide_btn);

        textBox=(TextView) findViewById(R.id.result_text);

        View.OnClickListener btn_click= new View.OnClickListener() {

            public void onClick(View v){

                if(v.getId() == R.id.add_btn) {

                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());

                    double result = firstInt + secondInt;

                    textBox.setText(String.valueOf(result));
                }

                if (v.getId()==R.id.minus_btn){

                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());

                    double result = firstInt- secondInt;

                    textBox.setText(String.valueOf(result));

                }

                if (v.getId()==R.id.multiply_btn){

                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());

                    double result = firstInt * secondInt;

                    textBox.setText(String.valueOf(result));
                }

                if (v.getId()==R.id.divide_btn){

                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());

                    double result = firstInt / secondInt;

                    textBox.setText(String.valueOf(result));

                }
            }
        };

        addBox.setOnClickListener(btn_click);
        minusBox.setOnClickListener(btn_click);
        multiplyBox.setOnClickListener(btn_click);
        divideBox.setOnClickListener(btn_click);

    }
}
