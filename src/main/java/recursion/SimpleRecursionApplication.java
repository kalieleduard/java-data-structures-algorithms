package recursion;

public class SimpleRecursionApplication {
    public static void main(String[] args) {
        countDownSpacecraft(10);
    }

    public static void countDownSpacecraft(final int aValue) {
        if (aValue < 0) {
            return;
        } else {
            System.out.println(aValue);
        }

        countDownSpacecraft(aValue - 1);
    }
}
