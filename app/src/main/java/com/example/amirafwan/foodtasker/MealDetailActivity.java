package com.example.amirafwan.foodtasker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MealDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_detail);
        getSupportActionBar().setTitle("Burger King");
    }
}
