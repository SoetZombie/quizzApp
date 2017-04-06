package com.example.android.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private Question question = new Question();
    private TextView questions;
    private Button answer1;
    private Button answer2;
    private Button answer3;


    private TextView summary;
    int index = 1;
    int corrects;
    int notCorrects;
    ArrayList<String> correctAnswers = new ArrayList<>();
    View view;



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

    public void setQuestion(View view) {
        question.nextQuestion(index);
        questions.setText(question.getQuestion());
        answer1.setText(question.getAnswer1());
        answer2.setText(question.getAnswer2());
        answer3.setText(question.getAnswer3());


    }

    public void buttonAnswer1(View view) {
        if(getIndex()<10) {
            question.setYourAnswer(question.getAnswer1());
            if (question.yourAnswer.equals(question.correctAnswer)) {
                corrects++;

            } else {
                notCorrects++;
            }
            addToArrayList(view);
        }
        else{
            addToArrayList(view);
            goToSummary(view);
        }

    }


    public void buttonAnswer2(View view) {
        if(getIndex()<10) {
            question.setYourAnswer(question.getAnswer2());
            if (question.yourAnswer.equals(question.correctAnswer)) {
                corrects++;

            } else {
                notCorrects++;
            }
            addToArrayList(view);
        }
        else{
            addToArrayList(view);
            goToSummary(view);
        }


    }

    public void buttonAnswer3(View view) {
        if(getIndex()<10) {
            question.setYourAnswer(question.getAnswer3());
            if (question.yourAnswer.equals(question.correctAnswer)) {
                corrects++;

            } else {
                notCorrects++;
            }
            addToArrayList(view);
        }
        else{
            addToArrayList(view);
            goToSummary(view);
        }



    }
    public void addToArrayList(View view){
        String answer;
        if(question.getYourAnswer().equals(question.getCorrectAnswer())){
            answer = "Your answer was : " + question.getYourAnswer()+"\n " + "Correct answer was : " + question.getCorrectAnswer()+"✓ \n\n" ;
        }
        else{
            answer = "Your answer was : " + question.getYourAnswer()+"\n " + "Correct answer was : " + question.getCorrectAnswer()+"✘ \n\n";
        }
        correctAnswers.add(answer);
        index++;
        question.nextQuestion(index);
        setQuestion(view);
    }

    public void goToSummary(View view){
        setContentView(R.layout.summary);
        TextView summary = (TextView) findViewById(R.id.summaryTextView) ;
        summary.setText(printEverything());;
    }

//    public void summary() {
//        questions.setText(correctAnswers.);
//    }
//    public void printAll(View view){
//        questions.setText(printEverything());
//    }
    public String printEverything() {
        String listString = "";
        for (String s : correctAnswers) {
            listString += s + "\t";
        }

        return (listString);
    }


    public View getView() {
        return view;
    }
    public int getIndex(){
        return index;
    }


}
