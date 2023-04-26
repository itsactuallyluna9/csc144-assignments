package practice_problems;

public class Question16 {
    /**
     * Reverses an array of integers.
     * (The same logic can be applied to any array of any type, but we'll stick with ints for now.)
     * @param lst the array to reverse
     * @return the reversed array
     */
    public static int[] reverseList(int[] lst) {
        int[] reversed = new int[lst.length];
        for (int i = 0; i < lst.length; i++) {
            reversed[i] = lst[lst.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5};
        int[] reversed = reverseList(lst);
        System.out.print("reverseList({1, 2, 3, 4, 5}) -> {");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
            if (i != reversed.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}