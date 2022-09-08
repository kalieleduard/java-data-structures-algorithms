package bubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortApplication {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(buildRandom())));
    }

    private static int[] buildRandom() {
        final int[] array = new int[10];

        final Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    private static int[] sort(final int[] array) {
        boolean sorted = false;
        int lastIndex = array.length - 1;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < lastIndex; i++) {
                if (array[i] > array[i + 1]) {
                    final int first = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = first;
                    sorted = false;
                }
            }

            lastIndex -= 1;
        }

        return array;
    }
}
