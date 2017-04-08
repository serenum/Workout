package com.serenum.android.workout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Serenum on 08.04.2017.
 */

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    public void onCreate(Bundle savedOnInstanceState) {
        super.onCreate(savedOnInstanceState);
        setContentView(R.layout.detail_layout);
        WorkoutDetailFragment detailFragment =
                (WorkoutDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detail_fragment);
        long workoutID = (Long) getIntent().getExtras().get(DetailActivity.EXTRA_WORKOUT_ID);
        detailFragment.setWorkoutID(workoutID);
    }
}
