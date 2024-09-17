package ru.aston.fac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.aston.fac.FactorialCalc.getFactorial;

public class FactorialTest {
    private int n;
    private int expected;
    private int actual;

    @Test
    @DisplayName("The factorial of a positive number")
    void factorialOfPositiveNumber() {
        n = 6;
        expected = 720;
        actual = getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Factorial of the One")
    void factorialOne() {
        n = 0;
        expected = 1;
        actual = getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Factorial of zero")
    void factorialZero() {
        n = 1;
        expected = 1;
        actual = getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("The factorial of a negative number")
    void factorialNegative() {
        n = -1;
        expected = 0;
        actual = getFactorial(n);
        assertEquals(expected, actual);
    }
}
