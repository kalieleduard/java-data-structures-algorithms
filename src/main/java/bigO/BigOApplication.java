package bigO;

import java.util.List;

public class BigOApplication {

    /**
     *
     * This is an algorithm whose complexity is O(n),
     * because performance change as the data increases
     */

    public void first() {
        final var things = List.of("apples", "bananas", "cribs", "dulcimers");
        for (final String thing : things) {
            System.out.println(thing);
        }
    }
}
