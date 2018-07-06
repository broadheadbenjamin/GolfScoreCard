package com.ge.golfscorecard;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {
    private Hole[] mHoles = new Hole[18];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize holes.
        int holeCount = 1;
        int strokeCount = 0;
        for (Hole hole: mHoles) {
            hole = new Hole("Hole" + holeCount + " :", strokeCount);
            holeCount++;
        }
    }
}
