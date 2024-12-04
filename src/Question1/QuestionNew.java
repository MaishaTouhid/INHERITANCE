package Question1;

public class QuestionNew {
    public static void main(String[] args) {

    // Create a NumericQuestion object
    NumericQuestion question = new NumericQuestion();

    // Set the question text and numeric answer
        question.setText("What is the value of π to two decimal places?");
        question.setAnswer(3.14);

    // Display the question
        question.display();

    // Test responses
        System.out.println("Response: 3.14 - Correct? " + question.checkAnswer("3.14"));
        System.out.println("Response: 3.15 - Correct? " + question.checkAnswer("3.15"));
        System.out.println("Response: 3.13 - Correct? " + question.checkAnswer("3.13"));
        System.out.println("Response: 3.16 - Correct? " + question.checkAnswer("3.16"));
        System.out.println("Response: Three point fourteen - Correct? " + question.checkAnswer("Three point fourteen"));
        }

}
