package hashTables;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindNonDuplicatedValuesApplication {
    public static void main(String[] args) {
        System.out.println(getFirstNonDuplicatedValue());
    }

    private static Character getFirstNonDuplicatedValue() {
        final char[] characters = "minimum".toCharArray();
        final Map<Character, Integer> isNonDuplicated = new HashMap<>();

        for (final char character : characters) {
            if (Objects.nonNull(isNonDuplicated.get(character))) {
                isNonDuplicated.put(character, isNonDuplicated.get(character) + 1);
            } else {
                isNonDuplicated.put(character, 1);
            }
        }

        for (final char character : characters) {
            if (isNonDuplicated.get(character) == 1) {
                return character;
            }
        }

        return null;
    }
}
