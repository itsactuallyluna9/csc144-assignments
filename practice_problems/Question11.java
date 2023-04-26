package practice_problems;

public class Question11 {
    /**
     * Sums the elements of an array.
     * @param lst the array to sum
     * @return the sum of the elements of the array
     */
    public static int sum(int[] lst) {
        int sum = 0;
        for (int i = 0; i < lst.length; i++) {
            sum += lst[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5};
        System.out.println("sum({1, 2, 3, 4, 5}) -> " + sum(lst));
    }
}