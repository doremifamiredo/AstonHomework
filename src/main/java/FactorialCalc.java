public class FactorialCalc {

    public int getFactorial(int f) {
        if (f < 0)
            throw new NegativeNumberException
                    ("The factorial of a negative number does not exist");
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println(String.format("The factorial of the number %d is equal to %d", f, result));
        return result;
    }
}
