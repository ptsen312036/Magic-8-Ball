package com.adobe.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ASKButton;
        ASKButton = (Button) findViewById(R.id.ASKButton);

        final ImageView imageA = (ImageView) findViewById(R.id.imageA);

        final int[] decisionArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        ASKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("8Ball", "Ze Button has been pressed!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                Log.d("8Ball", "The random number is:" + number);

                imageA.setImageResource(decisionArray[number]);
            }
        });
    }
}
