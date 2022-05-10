package Lesson6;

public class MyArraySizeException extends Exception {
    MyArraySizeException() {
        System.out.println("Array size exceeded");
    }
}
