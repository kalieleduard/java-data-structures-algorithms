package linearSearch;

public class LinearSearchApplication {
    public static void main(String[] args) {
        final int[] array = { 1, 10, 12, 6 };
        System.out.println(search(array, 0));
        System.out.println(search(array, 1));
    }

    private static boolean search(final int[] array, final int element) {
        for (int j : array) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }
}
