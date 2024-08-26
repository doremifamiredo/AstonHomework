import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class SumArrayTest {

    Random r = new Random();
    SumArray service = new SumArray();

    String[][] createTwoDimensionalArray(int lines, int columns) {
        String[][] tdArray = new String[lines][columns];
        for (int lin = 0; lin < lines; lin++) {
            for (int col = 0; col < columns; col++) {
                tdArray[lin][col] = Integer.toString(r.nextInt(100));
            }
        }
        return tdArray;
    }

    String[][] createTwoDimensionalArraySimple(int lines, int columns) {
        String[][] tdArray = new String[lines][columns];
        for (int lin = 0; lin < lines; lin++) {
            for (int col = 0; col < columns; col++) {
                tdArray[lin][col] = "2";
            }
        }
        return tdArray;
    }

    String[][] createTwoDimensionalArrayWithError(int lines, int columns) {
        String[][] tdArray = new String[lines][columns];
        int linErr = r.nextInt(lines);
        int colErr = r.nextInt(columns);
        for (int lin = 0; lin < lines; lin++) {
            for (int col = 0; col < columns; col++) {
                if (lin != linErr || col != colErr) tdArray[lin][col] = Integer.toString(r.nextInt(100));
                else tdArray[linErr][colErr] = "error";
            }
        }
        return tdArray;
    }

    String[][] createTwoDimensionalArrayWrongSize() {
        int lin = r.nextInt(r.nextInt(5 + 1));
        int col = r.nextInt(r.nextInt(5 + 1));
        String[][] tdArray = new String[lin][col];
        for (int l = 0; l < lin; l++) {
            for (int c = 0; c < col; c++) {
                tdArray[l][c] = Integer.toString(r.nextInt(100));;
            }
        }
        return tdArray;
    }

    @Test
    void testSimple() {
        Assertions.assertEquals(8 * 4, service.sumArray(createTwoDimensionalArraySimple(4, 4)));
    }

    @Test
    void testTDArray() {
        String[][] tdArr = createTwoDimensionalArrayWithError(4, 4);
        service.sumArray(tdArr);
    }

    @Test
    void testTDArrayWithErr() {
        Assertions.assertThrows(MyArrayDataException.class, () -> {
            service.sumArray(createTwoDimensionalArrayWithError(4, 4));
        });
    }

    @Test
    void wrongSizeTest() {
        createTwoDimensionalArrayWrongSize();
    }

    @Test
    void testTDArrayWrongSize() {
        Assertions.assertThrows(MyArraySizeException.class, () -> {
            service.sumArray(createTwoDimensionalArrayWrongSize());
        });
    }
}