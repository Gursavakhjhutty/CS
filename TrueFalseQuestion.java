package src;

import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: " + question;
        this.correctAnswer = answer.equals("true") || answer.equals("yes") ? "TRUE" : "FALSE";
    }

    public String ask() {
        return ask(question);
    }

    private String ask(String question) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("TRUE") || answer.equals("FALSE")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
            }
        }
    }
}
