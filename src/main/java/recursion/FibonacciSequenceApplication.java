package recursion;

public class FibonacciSequenceApplication {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    private static int fib(final int i) {
        if (i <= 1)
            return i;
        return fib(i - 1) + fib(i - 2);
    }
}
