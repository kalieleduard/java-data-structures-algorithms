package recursion;

public class StairCaseApplication {
    public static void main(String[] args) {
        System.out.println(numberOfPaths(6));
    }

    private static int numberOfPaths(final int n) {
        if (n < 0)
            return 0;

        if (n == 1 || n == 0)
            return 1;

        return numberOfPaths(n - 1) + numberOfPaths(n - 2) + numberOfPaths(n - 3);
    }
}
