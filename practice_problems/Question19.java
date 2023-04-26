package practice_problems;

public class Question19 {
    /**
     * Returns if the array contains the key.
     * @param lst the array to search
     * @param key the key to search for
     * @return if the array contains the key
     */
    public static boolean isIn(int[] lst, int key) {
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5};
        System.out.println("isIn({1, 2, 3, 4, 5}, 3) -> " + isIn(lst, 3));
        System.out.println("isIn({1, 2, 3, 4, 5}, 6) -> " + isIn(lst, 6));
    }
}