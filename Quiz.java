package src;
import javax.swing.JOptionPane;
public class Quiz {
    static int nQuestions = 0;
    static int nCorrect = 0;
    public static void main(String[] args) {
        String question1 = "Which one of the following is a programming language?\n";
        question1 += "A. Java\n";
        question1 += "B. HTML\n";
        question1 += "C. CSS\n";
        question1 += "D. XML\n";
        question1 += "E. SQL\n";
        check(question1, "A");

        String question2 = "Which one of the following is a web markup language?\n";
        question2 += "A. C++\n";
        question2 += "B. HTML\n";
        question2 += "C. JavaScript\n";
        question2 += "D. Python\n";
        question2 += "E. Swift\n";
        check(question2, "B");

        String question3 = "Which one of the following is a scripting language?\n";
        question3 += "A. C#\n";
        question3 += "B. PHP\n";
        question3 += "C. Ruby\n";
        question3 += "D. Go\n";
        question3 += "E. Kotlin\n";
        check(question3, "C");

        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
    }

    static String ask(String question) {
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

    static void check(String question, String correctAnswer) {
        nQuestions++;
        String answer = ask(question);

        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
        }
    }
}
