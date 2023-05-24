package src;

import javax.swing.*;
import java.awt.*;

public class MultipleChoiceQuestion extends Question {
    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        super(query);
        addChoice("A", a);
        addChoice("B", b);
        addChoice("C", c);
        addChoice("D", d);
        addChoice("E", e);
        initQuestionDialog();
        correctAnswer = answer;
    }

    void addChoice(String name, String label) {
        JPanel choice = new JPanel(new BorderLayout());
        JButton button = new JButton(name);
        button.addActionListener(question);
        choice.add(button, BorderLayout.WEST);
        choice.add(new JLabel(label + " ", JLabel.LEFT), BorderLayout.CENTER);
        question.add(choice);
    }

    void check() {
        String answer = ask();
        nQuestions++;
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null,"Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
        }
    }
}
