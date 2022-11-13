package hashTables;

import java.util.HashMap;
import java.util.Map;

public class FindMissingLetterApplication {
    public static void main(String[] args) {
        System.out.println(findMissingLetter());
    }

    private static String findMissingLetter() {
        final char[] chars = "the quick brown box jumps over a lazy dog".toCharArray();
        final char[] alphabetic = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        final Map<Character, Boolean> currentValues = new HashMap<>();

        for (final char i : chars) {
            currentValues.put(i, true);
        }

        for (final char character : alphabetic) {
            if (!currentValues.getOrDefault(character, false)) {
                return String.valueOf(character);
            }
        }

        return null;
    }
}
