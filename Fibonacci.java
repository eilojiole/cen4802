package Module2;

/**
 * This class will display the calculation of the nth term within the Fibonacci sequence.
 */
public class Fibonacci {

    /**
     * This method is responsible for recursively calculating the nth term in the Fibonacci sequence.
     *
     * @param n will be the term that we are going to calculate within our sequence.
     * @return This in term will produce the nth term within the Fibonacci sequence.
     */
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * This is our Main method that will serve to call the fibonacci sequence recursively which we will then calculate the 10th term within our sequence.
     * This will Output the result
     *
     * @param args This will be our command line argument.
     */
    public static void main(String[] args) {
        int n = 10;
        int nthTerm = fibonacciRecursive(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}