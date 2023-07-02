package bigO;

public class SelectionSortApplication {

    /**
     *
     * Given an array that contains 5 elements, in the worst case scenario:

     *  Pass-Through #   # of Comparisons
     *  1                5 comparisons
     *  2                4 comparisons
     *  3                3 comparisons

     *  It would seem reasonable that we’d describe the efficiency of Selection Sort as being O(N² / 2),
     *  but, big O Notation ignores constants.

     *  In reality, however, Selection Sort is described in Big O as O(N2), just like Bubble Sort.
     */

    public int[] sort(int ...array) {
        var index = 0;
        var leastValueIndex = 0;

        while(true) {
            var unsorted = false;

            for (int i = index; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    unsorted = true;
                    leastValueIndex = i + 1;
                }
            }

            if (!unsorted) {
                break;
            }

            int aux = array[index];
            array[index] = array[leastValueIndex];
            array[leastValueIndex] = aux;

            index++;
        }

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
