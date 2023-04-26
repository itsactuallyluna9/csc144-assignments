package practice_problems;

public class Question15 {
    /**
     * Returns the smallest number in an array.
     * @param lst the array to search for the smallest number
     * @return the smallest number in lst
     */
    public static int smallestNum(int[] lst) {
        int smallest = lst[0];
        for (int i = 1; i < lst.length; i++) {
            if (lst[i] < smallest) {
                smallest = lst[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        // this uses ints for simplicity, but this WILL work with doubles, floats, etc.
        // literally just ctrl+f "int" and replace.
        int[] lst = {1, 2, 3, 4, 5};
        System.out.println("smallestNum({1, 2, 3, 4, 5}) -> " + smallestNum(lst));
    }
}