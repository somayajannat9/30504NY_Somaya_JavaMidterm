package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * iteration 1: 5*4
     * iteration 2: 4*3
     * iteration 3: 3*2
     * iteration 4: 2*1
     */

    public static int factorial(int x){

        // exit criteria for recursion
        if (x <= 1){
            return x;
        }
        // recursion criteria
        else {

//            System.out.println(x);
            return x * factorial(x-1);

        }
    }
    public static void main(String[] args) {

        int result = factorial(5);
        System.out.println(result);

    }
}
