package ucucite.edu.permutationcombination;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class listofComPer extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;


    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_com_per);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Quiz");

        mScoreView = findViewById(R.id.score);
        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);


        updateQuestions();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestions();
                    //This line of code is optional
                    Toast.makeText(listofComPer.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(listofComPer.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    updateQuestions();
                }
            }
        });
        //End of Button Listener for Button1


        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestions();
                    //This line of code is optional
                    Toast.makeText(listofComPer.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(listofComPer.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    updateQuestions();
                }
            }
        });
        //End of Button Listener for Button2

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestions();
                    //This line of code is optional
                    Toast.makeText(listofComPer.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(listofComPer.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    updateQuestions();
                }
            }
        });
        //End of Button Listener for Button3


        //End of Button Listener for Button3


    }
    private void updateQuestions(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice0(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice2(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;


    }

    private void updateScore(int point){
        mScoreView.setText("" + mScore);
    }

}


