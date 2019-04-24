package com.example.twoactivitiescordingcallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.twoactivitiescordingchallenge";
    private EditText ET1;
    private EditText ET2;
    private EditText ET3;
    private Button Btn1;
    private Button Btn2;
    private Button Btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET1 = findViewById(R.id.editText_1);
        ET2 = findViewById(R.id.editText_2);
        ET3 = findViewById(R.id.editText_3);

        Btn1 = findViewById(R.id.button1);
        Btn2 = findViewById(R.id.button2);
        Btn3 = findViewById(R.id.button3);
    }

    public void launchSecondActivity1(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = ET1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void launchSecondActivity2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = ET2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void launchSecondActivity3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = ET3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
