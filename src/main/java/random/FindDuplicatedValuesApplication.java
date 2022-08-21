package random;

import java.util.Arrays;
import java.util.Random;

@SuppressWarnings({
        "ForLoopReplaceableByForEach",
        "SameParameterValue"
})
public class FindDuplicatedValuesApplication {
    private static final int[] TEST = {10, 2, 10};

    public static void main(String[] args) {
        final int[] array_1  = buildRandom();
        System.out.println(Arrays.toString(array_1));
        System.out.println(solution_1(array_1) + "\n");

        System.out.println(solution_2(TEST));
    }

    private static int[] buildRandom() {
        final int[] array = new int[3];

        final Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    private static boolean solution_1(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean solution_2(final int[] array) {
        final int[] hasDuplicatedValues = new int[getMax(array)];

        for (int i = 0; i < array.length; i++) {
            if (hasDuplicatedValues[array[i]] == 1) {
                return true;
            } else {
                hasDuplicatedValues[array[i]] = 1;
            }
        }

        return false;
    }

    private static int getMax(final int[] array) {
        int maxValue = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue + 1;
    }
}
