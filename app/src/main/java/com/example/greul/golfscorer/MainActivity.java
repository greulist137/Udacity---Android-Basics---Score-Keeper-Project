package com.example.greul.golfscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int player1Score = 0;
    int player1Hole = 1;
    int player1HoleScore = 0;
    int player2Score = 0;
    int player2Hole = 1;
    int player2HoleScore = 0;

    public void increaseHolePlayer1(View view){
        TextView player1HoleView = (TextView) findViewById(R.id.player_1_hole);
        player1Hole += 1;
        player1HoleView.setText(String.valueOf(player1Hole));
        player1HoleScore = 0;

    }

    public void player1Stroke(View view){
        TextView player1ScoreView = (TextView) findViewById(R.id.player_1_hole_score);
        TextView player1HoleScoreView = (TextView) findViewById((R.id.player_1_score));
        player1HoleScore += 1;
        player1Score += 1;
        player1HoleScoreView.setText(String.valueOf(player1HoleScore));
        player1ScoreView.setText(String.valueOf(player1Score));
    }

    public void player1PenaltyOne(View view){
        TextView player1ScoreView = (TextView) findViewById(R.id.player_1_hole_score);
        TextView player1HoleScoreView = (TextView) findViewById((R.id.player_1_score));
        player1HoleScore += 1;
        player1Score += 1;
        player1HoleScoreView.setText(String.valueOf(player1HoleScore));
        player1ScoreView.setText(String.valueOf(player1Score));
    }

    public void player1PenaltyTwo(View view){
        TextView player1ScoreView = (TextView) findViewById(R.id.player_1_hole_score);
        TextView player1HoleScoreView = (TextView) findViewById((R.id.player_1_score));
        player1HoleScore += 2;
        player1Score += 2;
        player1HoleScoreView.setText(String.valueOf(player1HoleScore));
        player1ScoreView.setText(String.valueOf(player1Score));
    }

}
