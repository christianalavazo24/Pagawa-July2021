package ucucite.edu.permutationcombination;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView mGrade, mFinalScore;
    Button mRetryButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of " + QuizBook.questions.length);

        if (score == 9){
            mGrade.setText("Outstanding");
        }else if (score == 8){
            mGrade.setText("Good Work");
        }else if (score == 7) {
            mGrade.setText("Good Effort");
        }else {
            mGrade.setText("Go over your notes");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });

    }

    public void closequiz(View view) {
        new AlertDialog.Builder(ResultsActivity.this)
                .setTitle("Permutation & Combination")
                .setMessage("Are you sure you want to exit this game?")
                .setIcon(R.drawable.logoko)
                .setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            @TargetApi(11)
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(ResultsActivity.this, List.class );
                                startActivity(intent);
                            }
                        })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @TargetApi(11)
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
    }
}