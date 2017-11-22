package me.kirkhorn.knut.android_sudoku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TableRow;
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

    public void onCellClicked(View view) {
 //       System.out.println("THIS WORKED");
        //TableRow tableRow = new TableRow(this);
//        System.out.println(view.getTag());
        TextView textView = (TextView) view;
        textView.setText("2");
        /*

        System.out.println(view.getRootView().getTag());
        System.out.println(view.getRootView().getTag());
        System.out.println(view.getRootView().getTag());
        System.out.println(view.getRootView());
        System.out.println(view.getRootView().getParent());
         */
    }

    @Override
    public void onFragmentInteraction(String string) {
        System.out.println("CLICKED FRAGMENT");
    }
}
