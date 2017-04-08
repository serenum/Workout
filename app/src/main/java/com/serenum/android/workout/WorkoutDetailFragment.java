package com.serenum.android.workout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    private long workoutID;

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(savedInstanceState != null)
            this.workoutID = savedInstanceState.getLong("id");
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Workout workout = Workout.workouts[(int) workoutID];

            TextView title = (TextView) view.findViewById(R.id.name);
            title.setText(workout.getName());

            TextView description = (TextView) view.findViewById(R.id.description);
            description.setText(workout.getDescription());
        }
    }

    public void setWorkoutID(long workoutID) {
        this.workoutID = workoutID;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("id", workoutID);
    }
}
