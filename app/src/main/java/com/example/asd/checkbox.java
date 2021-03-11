package com.example.asd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class checkbox extends AppCompatActivity implements View.OnClickListener {

    TextView textBox;
    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        textBox = findViewById(R.id.textBox);
        
    }

    @Override
    public void onClick(View v) {

    }
}