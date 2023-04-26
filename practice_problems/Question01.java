package practice_problems;

public class Question01 {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        // Test cases, print in the format "isEven(n) -> true/false"
        System.out.println("isEven(2) -> " + isEven(2));
        System.out.println("isEven(3) -> " + isEven(3));
        System.out.println("isEven(4) -> " + isEven(4));
        System.out.println("isEven(-2) -> " + isEven(-2));
    }
}
