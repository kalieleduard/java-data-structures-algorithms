package recursion;

public class FibonacciSequenceApplication {
    public static void main(String[] args) {
        System.out.println(test("oCder", "Tpo"));
    }

    private static String test(final String first, final String second) {
        final String biggerString;
        final String smallerString;

        if (first.length() > second.length()) {
            biggerString = first;
            smallerString = second;
        } else {
            biggerString = second;
            smallerString = first;
        }

        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < smallerString.length(); i++) {
            builder.append(smallerString.charAt(i)).append(biggerString.charAt(i));
        }

        final int rest = biggerString.length() - smallerString.length();

        for (int i = rest; i > 0; i--) {
                builder.append(biggerString.charAt(biggerString.length() - i));
        }

        return builder.toString();
    }
}
