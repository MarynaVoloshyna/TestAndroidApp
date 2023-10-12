package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultText;
    private EditText firstInput, secondInput;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.textView);
        firstInput = findViewById(R.id.firstInput);
        secondInput = findViewById(R.id.secondInput);
        button = findViewById(R.id.resultButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInputText = firstInput.getText().toString();
                String secondInputText = secondInput.getText().toString();

                if (!firstInputText.isEmpty() && !secondInputText.isEmpty()) {
                    float num1 = Float.parseFloat(firstInputText);
                    float num2 = Float.parseFloat(secondInputText);
                    float res = num1 + num2;
                    resultText.setText(String.valueOf(res));
                } else {
                    resultText.setText("Please enter valid numbers.");
                }
            }
        });



    }
}