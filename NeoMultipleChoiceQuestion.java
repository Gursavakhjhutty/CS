package src;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";
        correctAnswer = answer.toUpperCase();
    }

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
        question1.check();

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
            "Which one of the following is a web markup language?",
            "C++",
            "HTML",
            "JavaScript",
            "Python",
            "Swift",
            "B"
        );
        question2.check();

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
            "Which one of the following is a scripting language?",
            "C#",
            "PHP",
            "Ruby",
            "Go",
            "Kotlin",
            "C"
        );
        question3.check();

        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
            "What is the default access modifier for a class in Java?",
            "public",
            "private",
            "protected",
            "package-private",
            "None of the above",
            "D"
        );
        question4.check();

        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
            "Which of the following data types can store a null value in Java?",
            "int",
            "float",
            "boolean",
            "String",
            "char",
            "D"
        );
        question5.check();

        showResults();
    }

    public String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }
    }

    public static void showResults() {
        JOptionPane.showMessageDialog(null, "Total questions: " + nQuestions + "\nCorrect answers: " + nCorrect);
        double percentage = (double) nCorrect / nQuestions * 100;
        JOptionPane.showMessageDialog(null, "Percentage correct: " + percentage + "%");
    }
}
