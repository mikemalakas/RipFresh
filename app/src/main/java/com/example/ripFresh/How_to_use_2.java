package com.example.ripFresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class How_to_use_2 extends AppCompatActivity {
    private Button next_button, prev_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use2);

        //button for next page
        next_button = (Button) findViewById(R.id.button_htu1);
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), How_to_use3.class);
                startActivity(intent);

            }
        });

        //button for next page
        prev_button = (Button) findViewById(R.id.button_htu1);
        prev_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HowToUse.class);
                startActivity(intent);

            }
        });
    }
}