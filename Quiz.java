package src;

import javax.swing.JOptionPane;

public class Quiz {
    static int nQuestions = 0;
    static int nCorrect = 0;

    public static void main(String[] args) {
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
            "Which one of the following is a programming language?",
            "Java",
            "HTML",
            "CSS",
            "XML",
            "SQL",
            "A"
        );
        check(question1);

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
            "Which one of the following is a web markup language?",
            "C++",
            "HTML",
            "JavaScript",
            "Python",
            "Swift",
            "B"
        );
        check(question2);

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
            "Which one of the following is a scripting language?",
            "C#",
            "PHP",
            "Ruby",
            "Go",
            "Kotlin",
            "C"
        );
        check(question3);

        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
    }

    static String ask(MultipleChoiceQuestion question1) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question1.question);
            answer = answer.toUpperCase();

            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }
    }

    static void check(MultipleChoiceQuestion question1) {
        nQuestions++;
        String answer = ask(question1);

        if (answer.equals(question1.correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + question1.correctAnswer + ".");
        }
    }
}
