package src;

import javax.swing.JOptionPane;

public class Quiz {
    static int nQuestions = 0;
    static int nCorrect = 0;

    public static void main(String[] args) {
        // Multiple-choice questions
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

        // True/false questions
        TrueFalseQuestion question6 = new TrueFalseQuestion("The Earth is flat.", "False");
        question6.check();

        TrueFalseQuestion question7 = new TrueFalseQuestion("Water boils at 100 degrees Celsius.", "True");
        question7.check();

        TrueFalseQuestion question8 = new TrueFalseQuestion("The sun rises in the west.", "False");
        question8.check();

        TrueFalseQuestion question9 = new TrueFalseQuestion("Humans have five senses.", "False");
        question9.check();

        TrueFalseQuestion question10 = new TrueFalseQuestion("Gravity is a force of attraction between objects.", "True");
        question10.check();

        showResults();
    }

    static String ask(String question) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")
                    || answer.equals("TRUE") || answer.equals("FALSE")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, E, TRUE, or FALSE.");
            }
        }
    }

    static void check(Question question) {
        nQuestions++;
        String answer = ask(question.getQuestion());

        if (answer.equals(question.getCorrectAnswer())) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + question.getCorrectAnswer() + ".");
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, "Total questions: " + nQuestions + "\nCorrect answers: " + nCorrect);
        double percentage = (double) nCorrect / nQuestions * 100;
        JOptionPane.showMessageDialog(null, "Percentage correct: " + percentage + "%");
    }
}
