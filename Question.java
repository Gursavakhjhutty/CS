public abstract class Question {
    protected static int nQuestions = 0;
    protected static int nCorrect = 0;

    protected String question;
    protected String correctAnswer;

    public void check() {
        String answer = ask();
        nQuestions++;

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            nCorrect++;
        } else {
            System.out.println("Incorrect. The correct answer is: " + correctAnswer);
        }
    }

    public static void showResults() {
        System.out.println("Total questions: " + nQuestions);
        System.out.println("Correct answers: " + nCorrect);
        double percentage = (double) nCorrect / nQuestions * 100;
        System.out.println("Percentage correct: " + percentage + "%");
    }

    abstract String ask();
}
