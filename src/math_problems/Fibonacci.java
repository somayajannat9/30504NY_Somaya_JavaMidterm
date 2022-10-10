package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void fibonacciMethod(int fib){

        int fibArr [] = new int [fib];
        fibArr[0] = 0;
        fibArr[1] = 1;
        fibArr[2] = 1;

        System.out.print("0");
        System.out.print(", 1");

        int index = 1;
        while ( fibArr[index] <= fib){

            index++;

            fibArr[index] = fibArr[index-1] + fibArr[index-2];

            if (fibArr[index] <= fib){
                System.out.print(", "+ fibArr[index]);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {

    }
}
