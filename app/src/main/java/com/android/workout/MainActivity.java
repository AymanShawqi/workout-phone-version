package com.android.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowDetails(View view){
        Intent intent=new Intent(this,DetailActivity.class);
        startActivity(intent);
    }

    @Override
    public void itemClicked(long id) {
        Toast.makeText(this,""+id,Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID,(int)id);
        startActivity(intent);
    }
}
