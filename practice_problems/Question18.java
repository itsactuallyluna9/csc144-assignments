package practice_problems;

public class Question18 {
    /**
     * Moves all zeros to the front of the array.
     * 
     * @param lst the array to modify
     */
    public static void moveZerosToFront(int[] lst) {
        // Probably not the most efficient way to do this, but it works.
        // It's also like 10:20pm at night and I'm gonna finish these questions, dammit!
        
        // Create an array that is the same size as the original
        int[] temp = new int[lst.length];

        // Create an index to keep track of where to put the next element
        int index = 0;

        // Iterate through the list, and add all of the 0s first
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] == 0) {
                temp[index] = lst[i];
                index++;
            }
        }

        // Iterate through the list again, and add all of the non-0s
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] != 0) {
                temp[index] = lst[i];
                index++;
            }
        }

        // Copy the elements of temp back into lst
        for (int i = 0; i < lst.length; i++) {
            lst[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] lst = { 1, 0, 2, 0, 3, 0, 4, 0, 5 };
        moveZerosToFront(lst);
        System.out.print("moveZerosToFront({1, 0, 2, 0, 3, 0, 4, 0, 5}) -> {");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i]);
            if (i != lst.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}