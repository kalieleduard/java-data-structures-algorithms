package recursion.dynamic;
import java.util.HashMap;
import java.util.Map;

public class FibonacciApplication {
    public static void main(String[] args) {
        System.out.println(fib(3, new HashMap<>()));
    }

    private static int fib(final int n, final Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (!memo.containsKey(n)) {
            memo.put(n, fib(n - 2, memo) +  fib(n - 1, memo));
        }

        return memo.get(n);
    }

    public static int simpleFib(final int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return simpleFib(n - 1) + simpleFib(n - 2);
    }
}
