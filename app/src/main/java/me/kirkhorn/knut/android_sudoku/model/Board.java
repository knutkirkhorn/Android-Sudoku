package me.kirkhorn.knut.android_sudoku.model;

import java.util.ArrayList;

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

    public int[][] getGameCells() {
        return gameCells;
    }

    public void copyValues(int[][] newGameCells) {
        for (int i = 0; i < newGameCells.length; i++) {
            for (int j = 0; j < newGameCells[i].length; j++) {
                gameCells[i][j] = newGameCells[i][j];
            }
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < gameCells.length; i++) {
            for (int j = 0; j < gameCells[i].length; j++) {
                if (gameCells[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBoardCorrect() {
        // Check horizontal
        for (int i = 0; i < gameCells.length; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < gameCells[i].length; j++) {
                int number = gameCells[i][j];
                if (numbers.contains(number)) {
                    return false;
                } else {
                    numbers.add(number);
                }
            }
        }

        // Check vertical
        for (int i = 0; i < gameCells.length; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < gameCells[i].length; j++) {
                int number = gameCells[j][i];
                if (numbers.contains(number)) {
                    return false;
                } else {
                    numbers.add(number);
                }
            }
        }

        // Check each group is in CellGroupFragment class for easier code
        // returns true if horizontal and vertical lines are correct
        return true;
    }

    public int getValue(int row, int column) {
        return gameCells[row][column];
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < gameCells.length; i++) {
            for (int j = 0; j < gameCells[i].length; j++) {
                if (j == 0) {
                    temp.append("\n");
                }

                int currentNumber = gameCells[i][j];
                if (currentNumber == 0) {
                    temp.append("-");
                } else {
                    temp.append(currentNumber);
                }

                if (j != (gameCells[i].length-1)) {
                    temp.append(" ");
                }
            }
        }
        return temp.toString();
    }
}
