public class FibonacciIterative {
    public int iterative(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}

/**
 * Fibonacci Iterative
 *
 * Time complexity O(n)
 *
 * Space complexity O(1)
 *
 */
