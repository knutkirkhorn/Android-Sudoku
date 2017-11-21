package me.kirkhorn.knut.android_sudoku;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Locale;

/**
 * Created by Knut on 21.11.2017.
 */

public class InstructionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        Locale locale = getResources().getConfiguration().locale;
        System.out.println(locale);

        Resources res = getBaseContext().getResources();
        res.updateConfiguration(new Configuration(), res.getDisplayMetrics());

        locale = getResources().getConfiguration().locale;
        System.out.println(locale);
    }

    public void onGoBackButtonClicked(View view) {
        finish();
    }
}
