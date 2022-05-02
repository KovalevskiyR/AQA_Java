package Lesson5.Solution1;

public class SwapElements {
    static <T> void swapArrElements(T[] array, int index1, int index2) {
        T i = array[index1];
        T j = array[index2];
        array[index1] = j;
        array[index2] = i;
    }
}
