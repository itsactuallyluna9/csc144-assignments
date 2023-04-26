package practice_problems;

public class Question23 {
    /**
     * Checks if the string is a palindrome.
     * 
     * This (currently) doesn't check numeric palindromes.
     * @param s the string to check
     * @return if the string is a palindrome
     */
    public static boolean isPalindrome(String s) {
        // first, filter out all non-alphabetic characters
        // (so stuff like "We panic in a pew." works)
        // while we're at it, convert to lowercase
        String filtered = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                filtered += Character.toLowerCase(c);
            }
        }
        // now, check if the filtered string is a palindrome.
        // we can do this by reversing the string and checking if it's equal to the original
        String reversed = "";
        for (int i = filtered.length() - 1; i >= 0; i--) {
            reversed += filtered.charAt(i);
        }
        return filtered.equals(reversed);
    }

    public static void main(String[] args) {  
        String s = "hello";
        System.out.println("isPalindrome(\"" + s + "\") -> " + isPalindrome(s));
        
        s = "racecar";
        System.out.println("isPalindrome(\"" + s + "\") -> " + isPalindrome(s));

        s = "We panic in a pew.";
        System.out.println("isPalindrome(\"" + s + "\") -> " + isPalindrome(s));
    }
}