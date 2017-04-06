package com.example.android.quizzapp;

import android.widget.Switch;


/**
 * Created by Luke on 05/04/2017.
 */

public class Question {
    String yourAnswer;
    String correctAnswer;
    String question;
    String answer1;
    String answer2;
    String answer3;
    MainActivity mainActivity;
    int index;



    public String getYourAnswer() {
        return yourAnswer;
    }

    public void setYourAnswer(String yourAnswer) {
        this.yourAnswer = yourAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }


    public void  question1(){
        question = "Who of the following people represent football ?";
        answer1 = "Petr Čech";
        answer2 = "Harry Potter";
        answer3 = "Michael Phelps";
        correctAnswer = answer1;
    }

    public void question2(){
        question = "How much is :\n 2+3*4-1-2 ?";
        answer1 = "11";
        answer2 = "17";
        answer3 = "5";
        correctAnswer = answer1;


    }

    public void question3(){
        question = "Who was the first man on the moon ?";
        answer1 = "Jurij Gagarin";
        answer2 = "Neil Amstrong";
        answer3 = "Rey Koranteng";
        correctAnswer = answer2;


    }
    public void question4(){
        question = "How many stars are on American flag ?";
        answer1 = "55";
        answer2 = "40";
        answer3 = "50";
        correctAnswer = answer3;


    }
    public void question5(){
        question = "Who is current American's president ?";
        answer1 = "Barrack Obama";
        answer2 = "Donald Trump";
        answer3 = "Hillary Clinton";
        correctAnswer = answer2;


    }
    public void question6(){
        question = "The Earth is approximately how many miles away from the sun ?";
        answer1 = "39 million ";
        answer2 = "93 million";
        answer3 = "193 million";
        correctAnswer = answer2;


    }
    public void question7(){
        question = "How much is 1 $ worth in cents ?";
        answer1 = "10";
        answer2 = "1000";
        answer3 = "100";
        correctAnswer = answer3;


    }
    public void question8(){
        question = "Who is current fastest sprinter in the world ?";
        answer1 = "Usain Bolt";
        answer2 = "Cristiano Ronaldo";
        answer3 = "Gereth Bale";
        correctAnswer = answer1;


    }
    public void question9(){
        question = "When 2nd world war ended ?";
        answer1 = "1945";
        answer2 = "1939";
        answer3 = "1918";
        correctAnswer = answer1;


    }
    public void question10(){
        question = "Which country is currently most populated ?";
        answer1 = "China";
        answer2 = "India";
        answer3 = "Russia";
        correctAnswer = answer1;


    }





    public void nextQuestion(int index){
        switch (index){
            case 1:
                question1();
                break;
            case 2:
                question2();
                break;
            case 3:
                question3();
                break;
            case 4:
                question4();
                break;
            case 5:
                question5();
                break;
            case 6:
                question6();
                break;
            case 7:
                question7();
                break;
            case 8:
                question8();
                break;
            case 9:
                question9();
                break;
            case 10:
                question10();
                break;
            case 11:


            default:
                break;



        }


    }

public int getIndex()
{
    return index;
}

}

