package recursion;

import java.util.Arrays;

public class InPlaceModificationApplication {
    public static void main(String[] args) {
        final int[] array = new int[]{ 1, 2, 3, 4, 5 };
        doubleValues(array, 0);
        System.out.println(Arrays.toString(array));
    }

    public static void doubleValues(final int[] anArray, final int anIndex) {
        if (!(anIndex >= anArray.length)) {
            anArray[anIndex] *= 2;
            doubleValues(anArray, anIndex + 1);
        }
    }
}
