package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button add, sub, mul, div, re;
    TextView Result, st;
    String str1, str2;

    void getInput() {
        str1 = edit1.getText().toString();
        str2 = edit2.getText().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setTitle("계산기");

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        re = findViewById(R.id.re);

        Result = findViewById(R.id.Result);
        st = findViewById(R.id.st);

        add.setOnClickListener(v -> {
            try {
                getInput();
                int result = Integer.parseInt(str1) + Integer.parseInt(str2);
                Result.setText("Result : " + result);
                st.setText("ADD");
            } catch (NumberFormatException e) {
                Result.setText("ERROR: Enter an integer");
            }
        });

        sub.setOnClickListener(v -> {
            try {
                getInput();
                int result = Integer.parseInt(str1) - Integer.parseInt(str2);
                Result.setText("Result : " + result);
                st.setText("Subtraction");
            } catch (NumberFormatException e) {
                Result.setText("ERROR: Enter an integer");
            }
        });

        mul.setOnClickListener(v -> {
            try {
                getInput();
                int result = Integer.parseInt(str1) * Integer.parseInt(str2);
                Result.setText("Result : " + result);
                st.setText("Multiplication");
            } catch (NumberFormatException e) {
                Result.setText("ERROR: Enter an integer");
            }
        });

        div.setOnClickListener(v -> {
            try {
                getInput();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);

                if (num2 == 0) {
                    Result.setText("Can't divison use 0");
                    st.setText("ERROR");
                } else {
                    int result = num1 / num2;
                    Result.setText("Result : " + result);
                    st.setText("Division");
                }
            } catch (NumberFormatException e) {
                Result.setText("Enter an integer");
                st.setText("ERROR");
            }
        });

        re.setOnClickListener(v -> {
            try {
                getInput();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);

                if (num2 == 0) {
                    Result.setText("Can't divison use 0);
                    st.setText("ERROR");
                } else {
                    int result = num1 % num2;
                    Result.setText("Result : " + result);
                    st.setText("Remainder");
                }
            } catch (NumberFormatException e) {
                Result.setText("Enter an integer");
                st.setText("ERROR");
            }
        });
    }
}
