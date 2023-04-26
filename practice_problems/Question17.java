package practice_problems;

public class Question17 {
    /**
     * Reverses an array of integers in place.
     * (The same logic can be applied to any array of any type, but we'll stick with ints for now.)
     * @param lst the array to reverse
     */
    public static void reverseInPlace(int[] lst) {
        for (int i = 0; i < lst.length / 2; i++) {
            int temp = lst[i];
            lst[i] = lst[lst.length - 1 - i];
            lst[lst.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5};
        reverseInPlace(lst);
        System.out.print("reverseInPlace({1, 2, 3, 4, 5}) -> {");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i]);
            if (i != lst.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}