package practice_problems;

public class Question21 {
    /**
     * Sorts the array in ascending order using insertion sort.
     * (The same logic can be applied to any array of any type, but we'll stick with
     * ints for now.)
     * 
     * @param lst the array to sort
     */
    public static void insertionSort(int[] lst) {
        // https://en.wikipedia.org/wiki/Insertion_sort
        // tl;dr: move through the array, inserting each element into its proper place.
        // repeat until the array is sorted.

        // Walk through the array, starting at index 1
        for (int i = 1; i < lst.length; i++) {
            // Move backwards through the array, swapping elements until
            // we find the right place for lst[i].
            int j = i;
            while (j > 0 && lst[j - 1] > lst[j]) {
                // Swap lst[j] and lst[j-1]
                int temp = lst[j];
                lst[j] = lst[j - 1];
                lst[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] lst = { 5, 4, 3, 2, 1 };
        insertionSort(lst);
        System.out.print("insertionSort({5, 4, 3, 2, 1}) -> {");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i]);
            if (i != lst.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}