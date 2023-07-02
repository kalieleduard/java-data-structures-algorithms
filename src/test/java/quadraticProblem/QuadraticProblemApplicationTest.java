package quadraticProblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticProblemApplicationTest {

    @Test
    public void givenADuplicatedArrayWhenVerifyDuplicatedValuesShouldReturnTrue() {
        final var app = new QuadraticProblemApplication();
        final var expectedArray = new int[]{1, 2, 3, 4, 1};

        final var actualResult = app.hasDuplicatedValue(expectedArray);

        Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenANotDuplicatedArrayWhenVerifyDuplicatedValuesShouldReturnFalse() {
        final var app = new QuadraticProblemApplication();
        final var expectedArray = new int[]{1, 2, 3, 4, 5};

        final var actualResult = app.hasDuplicatedValue(expectedArray);

        Assertions.assertFalse(actualResult);
    }

    @Test
    public void givenADuplicatedArrayWhenVerifyLinerDuplicatedValuesShouldReturnTrue() {
        final var app = new QuadraticProblemApplication();
        final var expectedArray = new int[]{1, 2, 3, 4, 1};

        final var actualResult = app.linearHasDuplicatedValue(expectedArray);

        Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenANotDuplicatedArrayWhenVerifyLinerDuplicatedValuesShouldReturnFalse() {
        final var app = new QuadraticProblemApplication();
        final var expectedArray = new int[]{1, 2, 3, 4, 5};

        final var actualResult = app.hasDuplicatedValue(expectedArray);

        Assertions.assertFalse(actualResult);
    }
}
