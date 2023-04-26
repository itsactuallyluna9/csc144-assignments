package practice_problems;

public class Question22 {
    // taken from question 20 but modified to sort chars
    private static void bubbleSortChars(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j + 1];
                    chars[j + 1] = chars[j];
                    chars[j] = temp;
                }
            }
        }
    }

    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        bubbleSortChars(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println("sortString(\"" + s + "\") -> " + sortString(s));
    }
}