package com.emrekin.emresandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_project);

        Project[] Projects = {
                new Project("Getting Started App", "first project of mine ,the default 'hello world app!", R.drawable.getting_started),
                new Project("BMI CALCULATOR", "A real life BMI calculator and with this project I learn variables,methods and conditions", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter inches to meters", R.drawable.tape),
                new Project("The Hungry Developer", "A basic menu app for restaurant , I learn classes, activities,objects,arrays,intents and listview", R.drawable.hungry_developer)
        };

        ProjectAdapter adapter = new ProjectAdapter(Projects);
        list.setAdapter(adapter);

    }
}