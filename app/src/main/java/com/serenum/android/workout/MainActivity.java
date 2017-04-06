package com.serenum.android.workout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkoutDetailFragment detailFragment = (WorkoutDetailFragment)getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        detailFragment.setWorkoutID(1);
    }
}
