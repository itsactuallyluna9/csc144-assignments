package practice_problems;

public class Question13 {
    /**
     * Returns an array of all the prime numbers in lst.
     * @param lst the array to search for prime numbers
     * @return an array of all the prime numbers in lst
     */
    public static int[] allPrimes(int[] lst) {
        // bug: this method returns an array of length lst.length, not the number of evens in lst
        // can be fixed once we learn about ArrayLists.
        int[] primes = new int[lst.length];
        int index = 0;
        for (int i = 0; i < lst.length; i++) {
            if (Question07.isPrime(lst[i])) {
                primes[index] = lst[i];
                index++;
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5};
        int[] primes = allPrimes(lst);
        System.out.print("allPrimes({1, 2, 3, 4, 5}) -> {");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i]);
            if (i != primes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}