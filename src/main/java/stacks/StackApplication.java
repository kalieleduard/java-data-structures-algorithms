package stacks;

import java.util.Stack;

public class StackApplication {
    public static void main(String[] args) {
        invertString();
    }

    public static void invertString() {
        final var messageToConvert = "abcd";
        final var charArray = messageToConvert.toCharArray();
        final var characterStack = new Stack<Character>();

        for (final char c : charArray) {
            characterStack.push(c);
        }

        while (characterStack.size() != 0) {
            System.out.println(characterStack.peek());
            characterStack.pop();
        }
    }
}
