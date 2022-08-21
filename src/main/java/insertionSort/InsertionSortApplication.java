package insertionSort;

import java.util.Arrays;

@SuppressWarnings("SameParameterValue")
public class InsertionSortApplication {
    private static final int[] ARRAY = {3, 5, 6, 10, 2};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(ARRAY)));
    }

    private static int[] insertionSort(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int position = i - 1;

            while(position >= 0) {
                if (array[position] > temp) {
                    array[position + 1] = array[position];
                    position = position - 1;
                } else {
                    break;
                }
            }

            array[position + 1] = temp;
        }

        return array;
    }
}
