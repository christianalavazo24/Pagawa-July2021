package ucucite.edu.permutationcombination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void permutation(View view) {
        Intent intent = new Intent(this,permutation.class);
        startActivity(intent);
    }

    public void combination(View view) {
        Intent intent = new Intent(this,combination.class);
        startActivity(intent);
    }

    public void truefalse(View view) {
        Intent intent = new Intent(this,truefalse.class);
        startActivity(intent);
    }

    public void multiplechoice(View view) {
        Intent intent = new Intent(this,multiplechoice.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, R.anim.nothing);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}