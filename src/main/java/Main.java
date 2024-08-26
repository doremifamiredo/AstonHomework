public class Main {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"3", "2", "3", "3"},
                {"3", "6", "1", "4"},
                {"0", "2", "7", "2"},
                {"0", "2", "7", "2"}
        };
        String[][] wrongSizeMatrix = {
                {"3", "2", "3", "3"},
                {"6", "1"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };
        String[][] matrixWithError = {
                {"3", "2", "3", "3"},
                {"6", "1", "error", "3"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };

        System.out.println(SumArray.sumArray(correctMatrix));

        try {
            System.out.println(SumArray.sumArray(wrongSizeMatrix));
        } catch (MyArraySizeException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(SumArray.sumArray(matrixWithError));
        } catch (MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
