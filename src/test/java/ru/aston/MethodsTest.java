package ru.aston;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    Methods methods = new Methods();

    @Test
    public void checkSumIsPositive() {
        Assertions.assertTrue(methods.checkSumSign(-5, 6));
    }

    @Test
    public void checkSumIsNegative() {
        Assertions.assertFalse(methods.checkSumSign(-12, -13));
    }

    @Test
    public void printColorRed() {
        Assertions.assertEquals(-1, methods.printColor(0));
    }

    @Test
    public void printColorYellow() {
        Assertions.assertEquals(0, methods.printColor(100));
    }

    @Test
    public void printColorGreen() {
        Assertions.assertEquals(1, methods.printColor(101));
    }

    @Test
    public void compareNumbersAIsMore() {
        Assertions.assertTrue(methods.compareNumbers(33, 3));
    }

    @Test
    public void compareEqualsNumbers() {
        Assertions.assertTrue(methods.compareNumbers(33, 33));
    }

    @Test
    public void compareNumbersAIsLess() {
        Assertions.assertFalse(methods.compareNumbers(33, 333));
    }

    @Test
    public void tenTwentyNine() {
        Assertions.assertFalse(methods.tenTwenty(3, 6));
    }

    @Test
    public void tenTwentyTen() {
        Assertions.assertTrue(methods.tenTwenty(5, 5));
    }

    @Test
    public void tenTwentyTwenty() {
        Assertions.assertTrue(methods.tenTwenty(15, 5));
    }

    @Test
    public void tenTwentyTwentyOne() {
        Assertions.assertFalse(methods.tenTwenty(13, 8));
    }

    @Test
    public void numberIsPositive() {
        Assertions.assertFalse(methods.isNumberPositive(0));
    }

    @Test
    public void numberIsNegative() {
        Assertions.assertTrue(methods.isNumberPositive(-1));
    }

    @Test
    public void yearIsNotLeap() {
        Assertions.assertFalse(methods.leapYear(9));
    }

    @Test
    public void yearIsLeap() {
        Assertions.assertTrue(methods.leapYear(12));
    }

    @Test
    public void yearIsMultipleHundred() {
        Assertions.assertFalse(methods.leapYear(300));
    }

    @Test
    public void yearIsMultipleFourHundred() {
        Assertions.assertTrue(methods.leapYear(800));
    }

    @Test
    public void replaceOneAndZero() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] newArray = methods.replaceOneAndZero(array);
        System.out.println(Arrays.toString(newArray));
    }

    @Test
    public void printHundred() {
        int[] array = methods.arrayIsHundred();
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void anotherArray() {
        int[] actual = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] expected = {2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2};
        Assertions.assertArrayEquals(expected, methods.anotherArray(actual));
    }

    @Test
    public void squareArray() {
        int[][] actual = methods.arrayDiagonals();
        System.out.println(Arrays.deepToString(actual));
    }

    @Test
    public void simpleArray() {
        int[] expected = {6,6,6};
        Assertions.assertArrayEquals(expected, methods.yetAnotherArray(3,6));
    }
}