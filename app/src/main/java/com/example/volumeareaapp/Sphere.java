package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    EditText sphereRadius;
    TextView textViewSphere;

    TextView textViewResult;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphereRadius = findViewById(R.id.editTextSphere);
        textViewSphere = findViewById(R.id.textViewSphere);
        textViewResult = findViewById(R.id.resultSphere);
        button = findViewById(R.id.button);

        button.setOnClickListener((View view) -> {
            String radius = sphereRadius.getText().toString();
            int r = Integer.parseInt(radius);

            double volume = (4.0 / 3.0) * Math.PI * r * r * r;
            double roundedVolume = Math.round(volume * 10) / 10.0;
            textViewResult.setText("V = " + roundedVolume + " m^3");
        });
    }
}