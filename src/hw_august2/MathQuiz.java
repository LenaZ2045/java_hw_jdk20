package hw_august2;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public Random random = new Random();
    public Scanner scanner = new Scanner(System.in);
    int userAnswer;
    int pointCorrect = 5;
    int userPoint;
    int pointIncorrect = -5;
    int correctPoint;
    public String name = "";
    int randomNum1 = random.nextInt(50, 100);
    int randomNum2 = random.nextInt(10)+2;
    public int sum() {
        return randomNum1 + randomNum2;
    }
    public int add() {
        return randomNum1 + randomNum1;
    }
    public int add1() {
        return randomNum1 + randomNum2 + randomNum1;
    }
    public int subtract() {
        return randomNum1 - randomNum2;
    }
    public int multiply() {
        return randomNum1 * randomNum2;
    }
    public int divide() {
        return randomNum1 / randomNum2;
    }
public void start()
    {
        while (userAnswer != sum()) {
            System.out.println();
            System.out.println("QUIZ #1 -What is ("+randomNum1+" + "+randomNum2+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+sum());
            userPoint = pointIncorrect;
            correctPoint = pointCorrect;
            System.out.println("For incorrect answer you would get (-5): "+userPoint);
        }
        System.out.println("#1 QUIZ is completed! Points earned: "+correctPoint);
        System.out.println();
        while (userAnswer != add()) {
            System.out.println("QUIZ #2 -What is ("+randomNum1+" + "+randomNum1+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+add());
            userPoint = pointIncorrect;
            correctPoint = pointCorrect*2;
            System.out.println("For incorrect answer you would get (10-5): "+(correctPoint+userPoint));
        }
        System.out.println("#2 QUIZ is completed! Points earned: "+correctPoint);
        System.out.println();
        while (userAnswer != subtract()) {
            System.out.println("QUIZ #3 -What is ("+randomNum1+" - "+randomNum2+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+subtract());
            userPoint = pointIncorrect;
            correctPoint = pointCorrect*3;
            System.out.println("For incorrect answer you would get (15-5): "+(correctPoint+userPoint));
        }
        System.out.println("#3 QUIZ is completed! Points earned: "+correctPoint);
        System.out.println();
        while (userAnswer != multiply()) {
            System.out.println("QUIZ #4 -What is: ("+randomNum1+" * "+randomNum2+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+multiply());
            userPoint = pointIncorrect;
            correctPoint = pointCorrect*4;
            System.out.println("For incorrect answer you would get (20-5): "+(correctPoint+userPoint));
        }
        System.out.println("#4 QUIZ is completed! Points earned: "+correctPoint);
        System.out.println();
        while (userAnswer != divide()) {
            System.out.println("QUIZ #5 -What is ("+randomNum1+" / "+randomNum2+")=? ENTER WHOLE 'int' number without REMAINDER!");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+divide());
            userPoint = pointIncorrect;
            correctPoint = pointCorrect*5;
            System.out.println("For incorrect answer you would get (25-5): " +(correctPoint+userPoint));
        }
        System.out.println("#5 QUIZ is completed! Points earned: "+correctPoint);
        System.out.println();
        while (userAnswer != add1()) {
            System.out.println("QUIZ #6 -What is ("+randomNum1+" + "+randomNum2+" + "+randomNum1+")=?");
            userAnswer = scanner.nextInt();
            System.out.println("You entered: "+userAnswer);
            System.out.println("Correct answer: "+add1());
            userPoint = pointIncorrect;
            correctPoint = pointCorrect*6;
            System.out.println("For incorrect answer you would get (30-5): "+(correctPoint+userPoint));
        }
        System.out.println("#6 QUIZ is completed! Points earned: "+correctPoint);
        System.out.println();
        System.out.println("Congratulations, "+name+"! You completed six MATH QUIZZES! Points "+name+", earned for MATH QUIZZES = "+correctPoint+'!');
    }
}
