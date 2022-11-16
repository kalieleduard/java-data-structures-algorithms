package recursion;

import java.util.Arrays;

public class GreaterNumberApplication {
    public static void main(String[] args) {
        int[] a = {1, 9, 3};
        System.out.println(max(a));
    }

    public static int max(final int[] array) {
        if (array.length == 1) {
            return array[0];
        }

        final int[] newArray = Arrays.copyOfRange(array, 1, array.length);
        final int maxReminder = max(newArray);

        return Math.max(array[0], maxReminder);
    }
}
