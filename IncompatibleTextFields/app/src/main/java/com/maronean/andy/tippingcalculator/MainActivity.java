package com.maronean.andy.tippingcalculator;

import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calcButton = (Button) findViewById(R.id.calculate);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inBill = (EditText) findViewById(R.id.billAmount);
                EditText inPercent = (EditText) findViewById(R.id.percentage);
                TextView textTotal = (TextView) findViewById(R.id.dollarSign);
                double bill = Double.parseDouble(inBill.getText().toString());
                double percent = Double.parseDouble(inPercent.getText().toString());
                double total = (percent * bill) /100;
                String strTotal = String.format("$%.2f",total);
                textTotal.setText(strTotal);
            }
        });
    }
}
