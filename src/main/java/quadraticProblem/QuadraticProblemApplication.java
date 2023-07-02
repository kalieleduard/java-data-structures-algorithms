package quadraticProblem;

public class QuadraticProblemApplication {

    /**
     * O(N²) Algorithm, given the worst scenario array(1, 2, 3, 4, 1), it will compare 25x.
     */

    public boolean hasDuplicatedValue(int ...array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                if (i != j && array[i] == array[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     *
     * Liner Solution for the given algorithm above.
     * O(N) Algorithm, given the worst scenario array(1, 2, 3, 4, 1), it will compare 5x.
     */

    public boolean linearHasDuplicatedValue(final int ...array) {
        final var duplicatedValues = new int[array.length];

        for (final int i : array) {
            if (duplicatedValues[i] == 1) {
                return true;
            } else {
                duplicatedValues[i] = 1;
            }
        }

        return false;
    }
}
