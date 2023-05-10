package src;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
    private String[] choices;
    private String[] validAnswers;

    public MultipleChoiceQuestion(String question, String... answers) {
        this.question = question;
        this.choices = new String[answers.length - 1];
        this.validAnswers = new String[answers.length - 1];
        this.correctAnswer = answers[answers.length - 1];

        for (int i = 0; i < answers.length - 1; i++) {
            this.choices[i] = answers[i];
            this.validAnswers[i] = String.valueOf((char) (i + 65));
        }
    }

    public String ask() {
        String fullQuestion = question + "\n";
        for (int i = 0; i < choices.length; i++) {
            fullQuestion += (char) (i + 65) + ": " + choices[i] + "\n";
        }

        return ask(fullQuestion);
    }

    private String ask(String question) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            for (String validAnswer : validAnswers) {
                if (answer.equals(validAnswer)) {
                    return answer;
                }
            }

            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter " + String.join(", ", validAnswers) + ".");
        }
    }
}
