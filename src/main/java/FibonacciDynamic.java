public class FibonacciDynamic {
    public int dynamicProgramming(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dynamic = new int[n + 1];
        dynamic[0] = 0;
        dynamic[1] = 1;

        for (int i = 2; i <= n; i++) {
            dynamic[i] = dynamic[i - 1] + dynamic[i - 2];
        }

        return dynamic[n];
    }
}
