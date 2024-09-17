package ru.aston.fac;

public class FactorialCalc {

    public static int getFactorial(int f) {
        if (f < 0) {
            System.out.println("The factorial of a negative number does not exist");
            return 0;
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
            System.out.println(String.format("The factorial of the number %d is equal to %d", f, result));
            return result;
        }
    }
}
