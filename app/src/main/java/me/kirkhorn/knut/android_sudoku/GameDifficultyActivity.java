package me.kirkhorn.knut.android_sudoku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by Knut on 22.11.2017.
 */

public class GameDifficultyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_difficulty);
    }

    public void onGoBackButtonClicked(View view) {
        finish();
    }

    public void onStartGameButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.GameActivity");
        startActivity(intent);
    }


}
