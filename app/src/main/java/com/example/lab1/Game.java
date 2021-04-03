package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Game extends AppCompatActivity {
    private static final int numberOfQuestion = 5;
    private final List<Question> questions = new ArrayList<Question>();

    public List<Question> getQuestions() {
        return questions;
    }

    public Game() {

    }

    private String getStringFromName(String name) {
        int stringId = this.getResources().getIdentifier(name, "string", this.getPackageName());
        String str = getString(stringId);
        return str;
    }

}
