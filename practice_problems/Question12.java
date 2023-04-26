package practice_problems;

public class Question12 {
    public static int[] allEvens(int[] lst) {
        // bug: this method returns an array of length lst.length, not the number of evens in lst
        // can be fixed once we learn about ArrayLists.
        int[] evens = new int[lst.length];
        int index = 0;
        for (int i = 0; i < lst.length; i++) {
            if (Question01.isEven(lst[i])) {
                evens[index] = lst[i];
                index++;
            }
        }
        return evens;
    }

    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5};
        int[] evens = allEvens(lst);
        System.out.print("allEvens({1, 2, 3, 4, 5}) -> {");
        for (int i = 0; i < evens.length; i++) {
            System.out.print(evens[i]);
            if (i != evens.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}