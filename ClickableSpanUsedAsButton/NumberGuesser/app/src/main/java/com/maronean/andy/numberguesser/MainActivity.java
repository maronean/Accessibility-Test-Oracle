package com.maronean.andy.numberguesser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int currentRandom;
    private boolean solved = false;
    public int getRandom() {
        int range = 101;
        return (int)(Math.random() * range);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentRandom = getRandom();
        final EditText guessText = (EditText) findViewById(R.id.editText);
        Button button = (Button)findViewById(R.id.button);
        final TextView resultText =(TextView)findViewById(R.id.resultText);
        Button buttony = (Button)findViewById(R.id.button);
        TextView textView =(TextView)findViewById(R.id.textView);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='#'> Choose Random Number </a>";
        textView.setText(Html.fromHtml(text));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = getRandom();
                guessText.setText(Integer.toString(random));
            }
        });
        buttony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved) {
                    solved = false;
                    currentRandom = getRandom();
                    resultText.setText("Make another guess!");
                } else {
                  int guess = Integer.parseInt(guessText.getText().toString());
                    if(guess > currentRandom) {
                        resultText.setText("Lower");
                    } else if(currentRandom > guess){
                        resultText.setText("Higher");
                    } else{
                        resultText.setText("Correct! Press submit to play again!");
                        solved = true;
                    }
                }
            }
        });
    }
}
