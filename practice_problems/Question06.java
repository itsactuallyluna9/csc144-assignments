package practice_problems;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter stop: ");
        int stop = scanner.nextInt();
        scanner.close();
        // code reuse :sunglasses:
        int[] range = Question02.rangeInclusive(start, stop);
        for (int i = 0; i < range.length; i++) {
            if (Question01.isEven(range[i])) {
                System.out.println(range[i]);
            }
        }
    }
}