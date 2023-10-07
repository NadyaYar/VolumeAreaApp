package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    TextView result, title;

    EditText radiusEdit, heightEdit;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        title = findViewById(R.id.textViewCylinder);
        result = findViewById(R.id.resultCylinder);
        radiusEdit = findViewById(R.id.editTextCylinderRadius);
        heightEdit = findViewById(R.id.editTextCylinderHeight);
        button = findViewById(R.id.buttonCylinder);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r = radiusEdit.getText().toString();
                int radius = Integer.parseInt(r);
                String h = heightEdit.getText().toString();
                int height = Integer.parseInt(h);

                double volume = Math.PI * radius * radius * height;
                result.setText(" V = " + volume + " m^3");
            }
        });

    }
}