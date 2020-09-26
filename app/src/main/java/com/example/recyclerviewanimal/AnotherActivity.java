package com.example.recyclerviewanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    public static final String ANIMAL = "animal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        Animal animal = (Animal)intent.getSerializableExtra(ANIMAL);
        TextView animalView = findViewById(R.id.anotherAnimalTextView);
        TextView animalView2 = findViewById(R.id.anotherAnimalTextView2);
        animalView.setText("ID: " + animal.getId());
        animalView2.setText("NAME: " + animal.getName());

    }
}