import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, String answer) {
        this.question = question;
        this.correctAnswer = answer.toUpperCase();
    }

    @Override
    public String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question + " (True/False)");
            answer = answer.toUpperCase();

            if (isValidAnswer(answer)) {
                return convertAnswer(answer);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
            }
        }
    }

    private boolean isValidAnswer(String answer) {
        return answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")
                || answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES");
    }

    private String convertAnswer(String answer) {
        if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
            return "FALSE";
        } else {
            return "TRUE";
        }
    }
}
