public class RandomX {
    private int[] array = new int[0];

    public void add(final int value) {
        final int lastIndex = array.length + 1;
        int[] result = new int[lastIndex];

        for (int i = 0; i < lastIndex; i++) {
            if (i == lastIndex - 1) {
                result[i] = value;
                break;
            }

            result[i] = array[i];
        }

        array = result;
    }

    public void addSet(final int value) {
        for (int i : array) {
            if (value == i) {
                throw new RuntimeException("Value Already Exists");
            }
        }

        add(value);
    }

    public int[] getAll() {
        return array;
    }
}
