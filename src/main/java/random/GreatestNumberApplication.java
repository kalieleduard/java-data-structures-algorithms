package random;

@SuppressWarnings("SameParameterValue")
public class GreatestNumberApplication {
    private static final int[] ARRAY = {10, 50, 20};

    public static void main(String[] args) {
        System.out.println(greatestNumber(ARRAY));
    }

    private static int greatestNumber(final int[] array) {
        for (int i : array) {
            boolean isValTheGreatest = true;

            for (int j : array) {
                if (j > i) {
                    isValTheGreatest = false;
                    break;
                }
            }

            if (isValTheGreatest) {
                return i;
            }
        }

        return -1;
    }
}
