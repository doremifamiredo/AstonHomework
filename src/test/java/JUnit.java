import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JUnit {
    FactorialCalc calc = new FactorialCalc();
    private int n;
    private int expected;
    private int actual;

    @Test
    @DisplayName("The factorial of a positive number")
    void factorialOfPositiveNumber() {
        n = 6;
        expected = 720;
        actual = calc.getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Factorial of the One")
    void factorialOne() {
        n = 1;
        expected = 1;
        actual = calc.getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Factorial of zero")
    void factorialZero() {
        n = 0;
        expected = 1;
        actual = calc.getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("The factorial of a negative number")
    void factorialNegative() {
        n = -1;
        assertThrows(NegativeNumberException.class, () -> {
            calc.getFactorial(n);
        });
    }
}
