package com.android.workout;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class WorkoutListFragment extends ListFragment {

      interface Listener{
        void itemClicked(long id);
    }

    private Listener listener;

    public WorkoutListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener=(Listener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        String[] names=new String[Workout.workouts.length];
        for(int i=0;i<names.length;i++){
            names[i]=Workout.workouts[i].getName();
        }
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
       if (listener !=null ){
           listener.itemClicked(id);
       }
    }
}