package com.example.lab1;

public class Question {
    private final String _question;
    private final String[] _answer;
    private final String[] _correctAnswer;

    public Question(String question, String[] answer, String[] correctAnswer) {
        _question = question;
        _answer = answer;
        _correctAnswer = correctAnswer;
    }

    public String get_question() {
        return _question;
    }

    public String[] get_answer() {
        return _answer;
    }

    public String[] get_correctAnswer() {
        return _correctAnswer;
    }
}
