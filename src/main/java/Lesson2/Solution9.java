package Lesson2;

import java.util.Arrays;

public class Solution9 {

    public static int[] arrayCreation(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; ++i) {
            array[i] = initialValue;
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayCreation(10, 3)));
    }
}
