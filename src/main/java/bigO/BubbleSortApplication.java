package bigO;

/**
 * Given an array unsorted, how can we sort them so that they end up in ascending order?
 */

public class BubbleSortApplication {


    /**
     * O(N²) if all elements of the array is unordered -> {4, 3, 2, 1} it will take almost the double of steps.
     */

    public int[] sort(int[] array) {

        boolean isUnsorted = true;
        var unsortedUntilIndex = array.length;

        while(isUnsorted) {
            isUnsorted = false;

            for (int i = 0; i < unsortedUntilIndex - 1; i++) {
                final var left = array[i];
                final var right = array[i + 1];

                if (left > right) {
                    isUnsorted = true;
                    array[i] = right;
                    array[i + 1] = left;
                }
            }

            unsortedUntilIndex -= 1;
        }

        // it will take 20 steps if the array length is 5,
        // just because we've already sorted the larger element and reduce every iteration above by 1;

        return array;
    }

    public boolean isSorted(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
