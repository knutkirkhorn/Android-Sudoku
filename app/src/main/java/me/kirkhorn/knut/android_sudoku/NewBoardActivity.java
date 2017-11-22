package me.kirkhorn.knut.android_sudoku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import me.kirkhorn.knut.android_sudoku.fragments.CellGroupFragment;

/**
 * Created by Knut on 19.11.2017.
 */

public class NewBoardActivity extends AppCompatActivity implements CellGroupFragment.OnFragmentInteractionListener {
    private final String TAG = "NewBoardActivity";
    private TextView clickedCell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_board);

        int cellGroupFragments[] = new int[]{R.id.cellGroupFragment, R.id.cellGroupFragment2, R.id.cellGroupFragment3, R.id.cellGroupFragment4,
                R.id.cellGroupFragment5, R.id.cellGroupFragment6, R.id.cellGroupFragment7, R.id.cellGroupFragment8, R.id.cellGroupFragment9};
        for (int i = 1; i < 10; i++) {
            CellGroupFragment thisCellGroupFragment = (CellGroupFragment) getSupportFragmentManager().findFragmentById(cellGroupFragments[i-1]);
            thisCellGroupFragment.setGroupId(i);
        }
    }

    public void onGoBackButtonClicked(View view) {
        finish();
    }

    public void onShowInstructionsButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.InstructionsActivity");
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            clickedCell.setText(String.valueOf(data.getIntExtra("chosenNumber", 1)));
        }
    }

    @Override
    public void onFragmentInteraction(int group, int cellId, View view) {
        clickedCell = (TextView) view;
        Log.i(TAG, "Clicked group " + group + ", cell " + cellId);
        Intent intent = new Intent("me.kirkhorn.knut.ChooseNumberActivity");
        startActivityForResult(intent, 1);
    }
}
