package practice_problems;

public class Question20 {
    /**
     * Sorts the array in ascending order using bubble sort.
     * (The same logic can be applied to any array of any type, but we'll stick with ints for now.)
     * @param lst the array to sort
     */
    public static void bubbleSort(int[] lst) {
        // https://en.wikipedia.org/wiki/Bubble_sort
        // tl;dr: move through the array, swapping adjacent elements if they're out of order.
        // repeat until the array is sorted.
        for (int i = 0; i < lst.length; i++) {
            for (int j = 0; j < lst.length - 1; j++) {
                if (lst[j] > lst[j + 1]) {
                    int temp = lst[j];
                    lst[j] = lst[j + 1];
                    lst[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] lst = {5, 4, 3, 2, 1};
        bubbleSort(lst);
        System.out.print("bubbleSort({5, 4, 3, 2, 1}) -> {");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i]);
            if (i != lst.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}