package Lesson5.Solution1;

import java.util.Arrays;
import static Lesson5.Solution1.SwapElements.swapArrElements;

public class Solution1 {
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
