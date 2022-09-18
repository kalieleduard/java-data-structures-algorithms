package recursion;

public class RecursionApplication {

    private int index = 0;

    public void init(final int value) {
        loop(value);
    }

    private void loop(final int value) {
        index++;

        if (index <= value) {
            System.out.println("Hello World x" + index);
            loop(value);
        }
    }

    public int factorial(final int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}


