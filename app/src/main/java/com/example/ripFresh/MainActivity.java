package com.example.ripFresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, button_aboutus, button_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.scan_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TakePic.class);
                startActivity(intent);

            }
        });

        button_aboutus = (Button) findViewById(R.id.about_btn);
        button_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent intent = new Intent(getApplicationContext(), About_Us.class);
                startActivity(intent);
            }
        });

        button_exit = (Button) findViewById(R.id.exit_btn);
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }
}