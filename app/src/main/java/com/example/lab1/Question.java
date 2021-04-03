package com.example.lab1;

import java.util.Set;

public class Question {
    private final String _question;
    private final Set<String> _answer;
    private final Set<String> _correct;

    public Question(String question, Set<String> answer, Set<String> correct) {
        _question = question;
        this._answer = answer;
        this._correct = correct;
    }

    public String get_question() {
        return _question;
    }

    public Set<String> get_answer() {
        return _answer;
    }

    public Set<String> get_correct() {
        return _correct;
    }
}
