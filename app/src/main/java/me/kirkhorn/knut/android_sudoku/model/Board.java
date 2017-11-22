package me.kirkhorn.knut.android_sudoku.model;

/**
 * Created by Knut on 22.11.2017.
 */

public class Board {
    private int[][] gameCells = new int[9][9];

    public Board() {

    }

    public void setValue(int row, int column, int value) {
        gameCells[row][column] = value;
    }

    public int getValue(int row, int column) {
        return gameCells[row][column];
    }
}
