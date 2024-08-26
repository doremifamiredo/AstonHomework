public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("The matrix must be of size 4x4");
    }
}
