package practice_problems;

import java.util.Scanner;

public class Question02 {
    /**
     * Write a function that takes two integers, start and stop, and returns an
     * array containing all integers between start and stop, including both.
     * @param start
     * @param stop
     * @return An array containing all integers between start and stop, including both.
     */
    public static int[] rangeInclusive(int start, int stop) {
        int[] range = new int[Math.abs(stop - start) + 1];
        if (start < stop) {
            for (int i = 0; i < range.length; i++) {
                range[i] = start + i;
            }
        } else if (start > stop) {
            for (int i = 0; i < range.length; i++) {
                range[i] = start - i;
            }
        } else {
            range[0] = start;
        }
        return range;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter stop: ");
        int stop = scanner.nextInt();
        scanner.close();
        int[] range = rangeInclusive(start, stop);
        for (int i = 0; i < range.length; i++) {
            System.out.println(range[i]);
        }
    }
}