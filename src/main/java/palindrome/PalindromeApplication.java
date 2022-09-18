package palindrome;

public class PalindromeApplication {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2));
        System.out.println(sumAllNumbersUpToN(10));
    }

    private static boolean isPalindrome(final int value) {
        final String number = String.valueOf(value);
        final String first = number.substring( 0, 1);
        final String last = number.substring(number.length() - 1);

        if (number.length() == 1) {
            return true;
        } else if (first.equals(last)) {
            return isPalindrome(Integer.parseInt(number.substring(1, number.length() - 1)));
        }

        return false;
    }

    private static int sumAllNumbersUpToN(int n) {
        if (n == 0) {
            return 0;
        } else {
            return sumAllNumbersUpToN(n - 1) + n;
        }
    }
}
