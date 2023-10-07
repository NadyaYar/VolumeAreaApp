package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    TextView title, result;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        title = findViewById(R.id.textViewCube);
        result = findViewById(R.id.resultCube);
        editText = findViewById(R.id.editTextCube);
        button = findViewById(R.id.buttonCube);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String length = editText.getText().toString();
                int l = Integer.parseInt(length);
                double volume = l * l * l;
                result.setText("V = " + volume + " m^3");
            }
        });
    }
}