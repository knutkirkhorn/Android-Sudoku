package me.kirkhorn.knut.android_sudoku;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import me.kirkhorn.knut.android_sudoku.fragments.CellGroupFragment;

/**
 * Created by Knut on 19.11.2017.
 */

public class GameActivity extends AppCompatActivity implements CellGroupFragment.OnFragmentInteractionListener {
    private int[][] gameBoard = new int[9][9];
    private final String TAG = "GameActivity";
    private TextView clickedCell;

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

    public void onGoBackButtonClicked(View view) {
        finish();
    }

    public void onShowInstructionsButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.InstructionsActivity");
        startActivity(intent);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            clickedCell.setText(String.valueOf(data.getIntExtra("chosenNumber", 1)));
            boolean isUnsure = data.getBooleanExtra("isUnsure", false);
            if (isUnsure) {
                clickedCell.setBackground(getResources().getDrawable(R.drawable.table_border_cell_unsure));
            } else {
                clickedCell.setBackground(getResources().getDrawable(R.drawable.table_border_cell));
            }
        }
    }

    @Override
    public void onFragmentInteraction(int groupId, int cellId, View view) {
        clickedCell = (TextView) view;
        Log.i(TAG, "Clicked group " + groupId + ", cell " + cellId);
        Intent intent = new Intent("me.kirkhorn.knut.ChooseNumberActivity");
        startActivityForResult(intent, 1);
    }
}
