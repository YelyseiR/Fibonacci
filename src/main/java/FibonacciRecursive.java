public class FibonacciRecursive {
    public int recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 1) + recursive(n - 2);
    }
}


/**
 * FibonacciRecursive
 *
 * Time complexity O(2^n)
 *
 * Space complexity O(n)
 *
 */
