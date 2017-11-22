package me.kirkhorn.knut.android_sudoku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Knut on 19.11.2017.
 */

public class GameActivity extends AppCompatActivity {
    private int[][] gameBoard = new int[9][9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initializeGameArray();
    }

    private void initializeGameArray() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = 0;
            }
        }
    }

    public boolean checkIfCorrectPlaced() {
        boolean won = false;

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                //TODO: check each row horizontal and vertical
            }
        }

        return won;
    }
}
