import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class TestNG {
    FactorialCalc calc = new FactorialCalc();
    private int n;
    private int expected;
    private int actual;

    @org.testng.annotations.Test
    void factorialOfPositiveNumber() {
        n = 6;
        expected = 720;
        actual = calc.getFactorial(n);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void factorialOne() {
        n = 1;
        expected = 1;
        actual = calc.getFactorial(n);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void factorialZero() {
        n = 0;
        expected = 1;
        actual = calc.getFactorial(n);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void factorialNegative() {
        n = -1;
        assertThrows(NegativeNumberException.class, () -> {
            calc.getFactorial(n);
        });
    }
}
