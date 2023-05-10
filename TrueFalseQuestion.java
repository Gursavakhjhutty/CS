public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, String answer) {
        this.question = question;
        this.correctAnswer = answer.toUpperCase(Locale.getDefault());
    }

    public String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question + " (True/False)");
            answer = answer.toUpperCase(Locale.getDefault());

            if (answer.equals("True") || answer.equals("False)) {
                return answer.substring(0, 1);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter True/False.");
            }
        }
    }
}
