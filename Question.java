package src;

import java.awt.*;
import javax.swing.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;
    protected QuestionDialog question;
    protected String correctAnswer;

    public Question(String questionText) {
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel(" " + questionText + " ", JLabel.CENTER));
    }

    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }

    public void check() {
        nQuestions++;
        String answer = ask();

        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
        }
    }

    public String ask() {
        question.setVisible(true);
        return question.answer;
    }

    public static void showResults() {
        JOptionPane.showMessageDialog(null, "Total questions: " + nQuestions + "\nCorrect answers: " + nCorrect);
        double percentage = (double) nCorrect / nQuestions * 100;
        JOptionPane.showMessageDialog(null, "Percentage correct: " + percentage + "%");
    }
}
