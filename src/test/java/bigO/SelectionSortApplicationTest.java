package bigO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortApplicationTest {

    @Test
    public void givenAUnsortedArrayWhenSortArrayShouldReturnSortedArray() {
        final var app = new SelectionSortApplication();
        final var expectedArray = new int[]{5, 2, 6, 10, 40};
        final var expectedSize = 5;


        final var actualResult = app.sort(expectedArray);

        Assertions.assertEquals(expectedSize, actualResult.length);
        Assertions.assertTrue(app.isSorted(actualResult));
    }
}
