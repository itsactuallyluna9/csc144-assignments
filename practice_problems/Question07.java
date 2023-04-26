package practice_problems;

public class Question07 {
    /**
     * Returns true if n is prime, false otherwise.
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            // negative numbers, 0, and 1 aren't primes
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // if n is divisible by i
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // Test cases, print in the format "isPrime(n) -> true/false"
        System.out.println("isPrime(2) -> " + isPrime(2)); // true
        System.out.println("isPrime(3) -> " + isPrime(3)); // true
        System.out.println("isPrime(4) -> " + isPrime(4)); // false
        System.out.println("isPrime(0) -> " + isPrime(0)); // false
        System.out.println("isPrime(-1) -> " + isPrime(-1)); // false
        System.out.println("isPrime(1000000007) -> " + isPrime(1000000007)); // true
    }
}