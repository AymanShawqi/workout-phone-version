package com.android.workout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutDetailFragment extends Fragment {

    private long workoutId;

    public WorkoutDetailFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view=getView();
        if (view != null){
            TextView titleTxt=view.findViewById(R.id.textTitle);
            TextView descriptionTxt=view.findViewById(R.id.textDescription);
            Workout workout=Workout.workouts[(int)workoutId];
            titleTxt.setText(workout.getName());
            descriptionTxt.setText(workout.getDescription());
        }
    }

    public void setWorkoutId(long workoutId) {
        this.workoutId = workoutId;
    }
}
