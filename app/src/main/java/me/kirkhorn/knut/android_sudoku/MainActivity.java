package me.kirkhorn.knut.android_sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartNewGameButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.GameActivity");
        startActivity(intent);
    }
}
