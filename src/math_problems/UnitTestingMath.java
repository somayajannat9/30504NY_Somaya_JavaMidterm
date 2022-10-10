package math_problems;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {

        Factorial factorialObject = new Factorial();

        int factorialNumber = 5;
        int result = factorialObject.factorial(factorialNumber);
        System.out.println(result);

        Fibonacci fibObject = new Fibonacci();
        int fibNumber = 100;
        fibObject.fibonacciMethod(fibNumber);



    }
}
