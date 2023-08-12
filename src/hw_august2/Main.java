package hw_august2;

public class Main {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();
        System.out.println();
        System.out.println("Hello! Resolve this MATH QUIZZES! Each correct answer = (5) points! Each incorrect answer = (-5) points!");
        System.out.println();
        System.out.println("What is your name: ");
        mathQuiz.name = mathQuiz.scanner.next();
        System.out.println("Please complete all six MATH QUIZZES, " + mathQuiz.name + "!");
        mathQuiz.start();
    }
}
