package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    TextView result, title;

    EditText editHeight, editArea;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        result = findViewById(R.id.resultPrism);
        title = findViewById(R.id.textViewPrism);
        editHeight = findViewById(R.id.editTextPrismHeight);
        editArea = findViewById(R.id.editTextArea);
        button = findViewById(R.id.buttonPrism);

        button.setOnClickListener((View view)->{String h = editHeight.getText().toString();
            int height = Integer.parseInt(h);
            String a = editArea.getText().toString();
            int area = Integer.parseInt(a);

            double volume = area * height;

            result.setText("V = " + volume + " m^3");});
    }
}