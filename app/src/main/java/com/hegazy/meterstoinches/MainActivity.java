package com.hegazy.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calc;
    private EditText input;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = (Button) findViewById(R.id.calc);
        input = (EditText) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.result);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                metersToInches(input , result);
            }
        });
    }
    public void metersToInches(EditText input,TextView result){
        if (input.getText().toString().equals("")){
            result.setText(R.string.error_message);
            result.setTextColor(Color.RED);
        }else {
            result.setTextColor(Color.BLACK);
            double meters = Double.parseDouble(input.getText().toString());
            //result.setText(input.getText().toString()+" Meters = "+(meters*39.3700787)+" Inches");
            //result.setText(Double.toString(meters*39.3700787)+" Inches");
            result.setText(String.format("%.2f",(meters*39.3700787))+" Inches");
        }
    }
}