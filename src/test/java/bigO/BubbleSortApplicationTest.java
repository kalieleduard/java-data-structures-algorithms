package bigO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortApplicationTest {

    @Test
    public void test() {
        final var app = new BubbleSortApplication();
        final var expectedArray = new int[]{4, 3, 2, 1};
        final var expectedSize = 4;

        final var actualResult  = app.sort(expectedArray);

        Assertions.assertEquals(expectedSize, actualResult.length);
        Assertions.assertTrue(app.isSorted(actualResult));
    }
}
