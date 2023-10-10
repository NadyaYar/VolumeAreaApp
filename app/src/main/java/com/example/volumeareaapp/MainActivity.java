package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<Shape> shapes;

    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);
        shapes = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.cubes, "cube");
        Shape s2 = new Shape(R.drawable.sphere, "sphere");
        Shape s3 = new Shape(R.drawable.cylinder, "cylinder");
        Shape s4 = new Shape(R.drawable.prism, "prism");

        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);
        shapes.add(s4);

        adapter = new MyCustomAdapter(getApplicationContext(), shapes);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


        gridView.setOnItemClickListener((AdapterView<?> adapterView, View view, int i, long l) -> {
            Shape selectedShape = shapes.get(i);
            Intent intent;

            switch (selectedShape.getShapeName()) {
                case "cube":
                    intent = new Intent(getApplicationContext(), Cube.class);
                    break;
                case "sphere":
                    intent = new Intent(getApplicationContext(), Sphere.class);
                    break;
                case "cylinder":
                    intent = new Intent(getApplicationContext(), Cylinder.class);
                    break;
                case "prism":
                    intent = new Intent(getApplicationContext(), Prism.class);
                    break;
                default:
                    intent = null;
                    break;
            }

            if (intent != null) {
                startActivity(intent);
            }
        });
    }
}