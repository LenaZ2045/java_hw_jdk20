package hw_july26;

public class Variable {
    public static void main(String[] args) {
        System.out.println("WATCH the magic here! I am using same variables but words change...");
        String word1 = "BLACK";
        String word2 = "WHITE";
        System.out.println("On my "+word2+" paper is "+word1+" ink?!");
        String word3 = word1;
        word1 = word2;
        word2 = word3;
        System.out.println("On my "+word2+" paper is "+word1+" ink?!");
    }
}
