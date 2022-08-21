package selectionSort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortApplication {
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
        for (int i = 0; i < array.length - 1; i++) {
            int lastNumberIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lastNumberIndex]) {
                    lastNumberIndex = j;
                }
            }

            if (lastNumberIndex != i) {
                final int temp = array[i];
                array[i] = array[lastNumberIndex];
                array[lastNumberIndex] = temp;
            }
        }

        return array;
    }
}
