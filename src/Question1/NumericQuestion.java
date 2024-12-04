package Question1;

// Base Question class
class Question {
    private String text;
    private String answer;

    // Constructor
    public Question() {
        this.text = "";
        this.answer = "";
    }

    // Method to set the question text
    public void setText(String questionText) {
        this.text = questionText;
    }

    // Method to set the correct answer
    public void setAnswer(String correctAnswer) {
        this.answer = correctAnswer;
    }

    // Method to check if a response matches the correct answer
    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }

    // Method to display the question
    public void display() {
        System.out.println(text);
    }
}

// NumericQuestion class
class NumericQuestion extends Question {
    private double numericAnswer;

    // Override setAnswer to handle numeric answers
    public void setAnswer(double correctAnswer) {
        this.numericAnswer = correctAnswer;
    }

    // Override checkAnswer to allow a tolerance of 0.01
    @Override
    public boolean checkAnswer(String response) {
        try {
            double numericResponse = Double.parseDouble(response);
            return Math.abs(numericResponse - numericAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Override display to include additional instructions for numeric responses
    @Override
    public void display() {
        super.display();
        System.out.println("(Please provide a numeric answer.)");
    }
}
