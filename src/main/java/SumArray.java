public class SumArray {

    public static int sumArray(String[][] array) {
        if (array.length != 4) throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int k = 0; k < 4; k++) {
                try {
                    sum += Integer.parseInt(array[i][k]);
                } catch (NumberFormatException msg) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }
        return sum;
    }
}
