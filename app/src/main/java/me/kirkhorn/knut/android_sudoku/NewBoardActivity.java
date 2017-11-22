package me.kirkhorn.knut.android_sudoku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import me.kirkhorn.knut.android_sudoku.fragments.CellGroupFragment;

/**
 * Created by Knut on 19.11.2017.
 */

public class NewBoardActivity extends AppCompatActivity implements CellGroupFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_board);

        //TODO: check for better method
        CellGroupFragment cellGroupFragment = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment);
        cellGroupFragment.setGroupId(1);
        CellGroupFragment cellGroupFragment2 = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment2);
        cellGroupFragment2.setGroupId(2);
        CellGroupFragment cellGroupFragment3 = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment3);
        cellGroupFragment3.setGroupId(3);
        CellGroupFragment cellGroupFragment4 = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment4);
        cellGroupFragment4.setGroupId(4);
        CellGroupFragment cellGroupFragment5 = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment5);
        cellGroupFragment5.setGroupId(5);
        CellGroupFragment cellGroupFragment6 = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment6);
        cellGroupFragment6.setGroupId(6);
        CellGroupFragment cellGroupFragment7 = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment7);
        cellGroupFragment7.setGroupId(7);
        CellGroupFragment cellGroupFragment8 = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment8);
        cellGroupFragment8.setGroupId(8);
        CellGroupFragment cellGroupFragment9 = (CellGroupFragment) getSupportFragmentManager().findFragmentById(R.id.cellGroupFragment9);
        cellGroupFragment9.setGroupId(9);
    }

    public void onGoBackButtonClicked(View view) {
        finish();
    }

    public void onShowInstructionsButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.InstructionsActivity");
        startActivity(intent);
    }

    public void onGroupClicked(View view) {
        System.out.println("CLICKED group: " + view.getTag());
    }

/*
    public void onCellClicked(View view) {
 //       System.out.println("THIS WORKED");
        //TableRow tableRow = new TableRow(this);
//        System.out.println(view.getTag());
        TextView textView = (TextView) view;
        textView.setText("2");
    }
 */

    @Override
    public void onFragmentInteraction(int group, int cellId) {
        System.out.println("CLICKED FRAGMENT" + group + ": " + cellId);

    }
}
