package ucucite.edu.permutationcombination;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class truefalse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truefalse);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("True or False");
    }


    public void truefalse(View view) {
        startActivity(new Intent(truefalse.this, QuizActivity.class));
    }
}