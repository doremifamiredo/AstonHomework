package ru.aston;

import java.util.Scanner;

public class Methods {
    //1
    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //2
    public boolean checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
            return true;
        } else {
            System.out.println("Сумма отрицательная");
            return false;
        }
    }

    //3
    public int printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
            return -1;
        }
        if (value > 100) {
            System.out.println("Зелёный");
            return 1;
        } else {
            System.out.println("Жёлтый");
            return 0;
        }
    }

    //4
    public boolean compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
            return true;
        } else {
            System.out.println("a < b");
            return false;
        }
    }

    //5
    public boolean tenTwenty(int a, int b) {
        int c = a + b;
        if (c > 9 && c < 21) return true;
        else return false;
    }

    //6 и 7
    public boolean isNumberPositive(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
            return false;
        } else {
            System.out.println("Число отрицательное");
            return true;
        }
    }

    //8
    public void printString(int quantity, String text) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
        }
    }

    //9
    public boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    //10
    public int[] replaceOneAndZero(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                newArray[i] = 0;
            } else {
                newArray[i] = 1;
            }
        } return newArray;
    }
    //11
    public int[] arrayIsHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    //12
    public int[] anotherArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                newArray[i] = array[i] * 2;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
    //13
    public int[][] arrayDiagonals() {
        int size = 7;
        int[][] twoDimArray = new int[size][size];
        for (int i = 0; i < twoDimArray.length; i++) {
            twoDimArray[i][i] = 1;
            twoDimArray[i][size - 1 - i] = 1;
        }
        return twoDimArray;
    }
    //14
    public int[] yetAnotherArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}