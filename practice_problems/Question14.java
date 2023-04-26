package practice_problems;

public class Question14 {
    /**
     * Returns the largest number in an array.
     * @param lst the array to search for the largest number
     * @return the largest number in lst
     */
    public static int largestNum(int[] lst) {
        int largest = lst[0];
        for (int i = 1; i < lst.length; i++) {
            if (lst[i] > largest) {
                largest = lst[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        // this uses ints for simplicity, but this WILL work with doubles, floats, etc.
        // literally just ctrl+f "int" and replace.
        int[] lst = {1, 2, 3, 4, 5};
        System.out.println("largestNum({1, 2, 3, 4, 5}) -> " + largestNum(lst));
    }
}