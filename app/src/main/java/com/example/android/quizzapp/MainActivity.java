package com.example.android.quizzapp;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    int index = 1;
    int corrects;
    int notCorrects;
    ArrayList<String> correctAnswers = new ArrayList<>();
    View view;
    private Question question = new Question();

    private TextView questions;
    private Button answer1;
    private Button answer2;
    private Button answer3;
    private TextView summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        questions = (TextView) findViewById(R.id.question);
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        //  summary = (TextView) findViewById(R.id.summaryTextView);
        question.nextQuestion(index);
        questions.setText(question.getQuestion());
        answer1.setText(question.getAnswer1());
        answer2.setText(question.getAnswer2());
        answer3.setText(question.getAnswer3());

    }

    public void restart(View view){
        index = 1;
        corrects= 0;
        notCorrects = 0;
        correctAnswers.clear();
        setContentView(R.layout.activity_main);
        questions = (TextView) findViewById(R.id.question);
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        question.nextQuestion(index);
        questions.setText(question.getQuestion());
        answer1.setText(question.getAnswer1());
        answer2.setText(question.getAnswer2());
        answer3.setText(question.getAnswer3());





    }

    public void setQuestion(View view) {
        question.nextQuestion(index);
        questions.setText(question.getQuestion());
        answer1.setText(question.getAnswer1());
        answer2.setText(question.getAnswer2());
        answer3.setText(question.getAnswer3());



    }

    public void buttonAnswer1(View view) {
        if (getIndex() < 10) {
            question.setYourAnswer(question.getAnswer1());

            addToArrayList(view);
        } else {
            question.setYourAnswer(question.getAnswer1());
            addToArrayList(view);
            score(view);
        }

    }

    public void buttonAnswer2(View view) {
        if (getIndex() < 10) {
            question.setYourAnswer(question.getAnswer2());

            addToArrayList(view);
        } else {
            question.setYourAnswer(question.getAnswer2());
            addToArrayList(view);
            score(view);
        }

    }

    public void buttonAnswer3(View view) {
        if (getIndex() < 10) {
            question.setYourAnswer(question.getAnswer3());

            addToArrayList(view);
        } else {
            question.setYourAnswer(question.getAnswer3());
            addToArrayList(view);
            score(view);
        }


    }

    public void addToArrayList(View view) {
        String answer;
        if (question.getYourAnswer().equals(question.getCorrectAnswer())) {
            answer = "Your answer was : " + question.getYourAnswer() + "\n " + "Correct answer was : " + question.getCorrectAnswer() + "✓ \n\n";
            corrects++;
        } else {
            answer = "Your answer was : " + question.getYourAnswer() + "\n " + "Correct answer was : " + question.getCorrectAnswer() + "✘ \n\n";
            notCorrects++;
        }
        correctAnswers.add(answer);
        index++;
        question.nextQuestion(index);
        setQuestion(view);
    }

    public void score(View view) {
        int totalScore = getCorrects() + getNotCorrects();
        setContentView(R.layout.score);
        TextView score = (TextView) findViewById(R.id.yourScore);
        ImageView scoreImg = (ImageView) findViewById(R.id.score);
        score.setText(getCorrects() + "/" + totalScore);
        if (corrects == 10) {
            scoreImg.setImageResource(R.drawable.good);
        } else if (corrects > 5) {
            scoreImg.setImageResource(R.drawable.medium);
        } else {
            scoreImg.setImageResource(R.drawable.bad);
        }

    }

    public void goToSummary(View view) {
        setContentView(R.layout.summary);
        TextView summary = (TextView) findViewById(R.id.summaryTextView);
        summary.setText(printEverything());

    }

    public String printEverything() {
        String listString = "";
        for (String s : correctAnswers) {
            listString += s + "\t";
        }

        return (listString);
    }

    public int getIndex() {
        return index;
    }

    public int getCorrects() {
        return corrects;
    }

    public int getNotCorrects() {
        return notCorrects;
    }

    public void saveScore(View view){
        setContentView(R.layout.ladderboards);
    }


}
