package ru.aston;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.printThreeWords();
        methods.checkSumSign(5, -50);
        methods.printColor(101);
        methods.compareNumbers(-3, 3);
        methods.tenTwenty(0, 9);
        methods.isNumberPositive(16);
        methods.printString(5, "Five");
        methods.leapYear(2024);
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] newArray = methods.replaceOneAndZero(array);
        methods.arrayIsHundred();
        int[] arrayTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        methods.anotherArray(arrayTwo);
        int[][] twoDimArray = methods.arrayDiagonals();
        int[] yetAnotherArray = methods.yetAnotherArray(2,2);
    }
}