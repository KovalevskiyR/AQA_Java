package Lesson5.Solution1;

import java.util.Arrays;

public class Solution1 {

    private static <T> void swapArrElements(T[] array, int index1, int index2) {
        T i = array[index1];
        T j = array[index2];
        array[index1] = j;
        array[index2] = i;
    }

    public static void main(String[] args) {
        String[] arr_string = {"word1", "word2", "word3"};
        Integer[] arr_int = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr_int));
        swapArrElements(arr_int, 0, 2);
        System.out.println(Arrays.toString(arr_int));
        System.out.println("-------------------------");
        System.out.println(Arrays.toString(arr_string));
        swapArrElements(arr_string, 0, 1);
        System.out.println(Arrays.toString(arr_string));
    }
}
