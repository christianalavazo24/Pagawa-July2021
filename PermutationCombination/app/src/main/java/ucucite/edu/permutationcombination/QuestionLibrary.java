package ucucite.edu.permutationcombination;

public class QuestionLibrary {
    private String mQuestions [] = {
            "Using all the letters of the word GIFT how many distinct words can be formed?",
            "Find out how many distinct three-digit numbers can be formed using all the digits of 1, 2, and 3.",
            "In how many different ways can five friends sit for a photograph of five chairs in a row?",
            "In how many different ways can the letters of the word MAGIC can be formed?",
            "A person has 4 coins if different denominations. What is the number of different sums of money the person can form?"
    };
    private String mchoice [][] = {
            {"22 words", "24 words", "256 words"},
            {"4", "5", "6"},
            {"120 ways", "24 ways", "240 ways"},
            { "24 ways", "120 ways", "240 ways"},
            {"12","15","11"}
    };

    private String mCorrectAnswers[] = {"24 words","6","120 ways","120 ways","15"};


    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice0(int a){
        String choice0 = mchoice[a][0];
        return choice0;
    }

    public String getChoice1(int a){
        String choice1 = mchoice[a][1];
        return choice1;
    }

    public String getChoice2(int a){
        String choice2 = mchoice[a][2];
        return choice2;
    }


    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

