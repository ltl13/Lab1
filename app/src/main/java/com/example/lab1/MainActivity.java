package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int questionNum = 1;
    private int currentAnswer = 1;

//    private TextView questionPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        this.questionPanel = (TextView)findViewById();
//        loadQuestion(2);
    }

//    private int getId(String name){
//        int questionId = this.getResources().getIdentifier(name, "string", this.getPackageName());
//        return questionId;
//    }
//    private void loadQuestion(int questionIndex){
//
//        int questionId = this.getId("question_"+ Integer.toString(questionIndex));
//        String question = getString(questionId);
//        this.questionPanel.setText(question);
//    }
}