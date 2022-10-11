package math_problems;

public class PrimeNumber {

    /**
     * INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     * Print out the prime numbers in the given range.
     * <p>
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        //range
        int min = 2;
        int max = 1000000;
        //find all prime numbers in the given range
        for (int n = min; n <= max; n++) {
            //check if this number is prime
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }
    public static boolean isPrime(int num) {
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}