package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamA(0);
        displayScoreTeamB(0);
    }


    /**
     * Displays the given score for Team A.
     */
    /*public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
*/
    public void three (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA (scoreTeamA);

    }

    public void two (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA (scoreTeamA);

    }

    public void one (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA (scoreTeamA);

    }


    public void threeB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB (scoreTeamB);

    }

    public void twoB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB (scoreTeamB);

    }

    public void oneB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB (scoreTeamB);

    }

    public void reset (View view) {
        scoreTeamA = scoreTeamA * 0;
        displayScoreTeamA(scoreTeamA);

        scoreTeamB =scoreTeamB * 0;
        displayScoreTeamB(scoreTeamB);

    }


    private void displayScoreTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));

    }

    private void displayScoreTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));

    }
}
