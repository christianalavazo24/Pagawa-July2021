package ucucite.edu.permutationcombination;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class multiplechoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplechoice);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Multiple Choice");


    }

    public void gotomultiple(View view) {
        Intent intent = new Intent(this, listofComPer.class);
        startActivity(intent);
    }
}