package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public class Dice {
        private int numSides;
        private Random random;

        public Dice(int numSides) {
            this.numSides = numSides;
            random = new Random();
        }

        public int roll() {
            return random.nextInt(numSides) + 1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.button);
        TextView resultTextView = findViewById(R.id.textView);
        rollButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RollDice();
            }
            void RollDice(){
                // Create new Dice object with 6 sides and roll it
                Dice dice = new Dice(6);
                int diceRoll = dice.roll();

                resultTextView.setText(Integer.toString(diceRoll));
            };
        });
    }
}