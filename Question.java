package src;

import javax.swing.JOptionPane;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;
    protected String question;
    protected String correctAnswer;

    public abstract String ask();

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

    public static void showResults() {
        JOptionPane.showMessageDialog(null, "Total questions: " + nQuestions + "\nCorrect answers: " + nCorrect);
        double percentage = (double) nCorrect / nQuestions * 100;
        JOptionPane.showMessageDialog(null, "Percentage correct: " + percentage + "%");
    }
}
