package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        TextView text3= (TextView) findViewById(R.id.text3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text3.setText("Registration Successful");
            }
        });

    }
}