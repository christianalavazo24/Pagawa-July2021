package ucucite.edu.permutationcombination;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class permutation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permutation);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Permutation");
    }
}