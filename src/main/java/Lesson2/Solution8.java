package Lesson2;

public class Solution8 {

    public static void main(String[] args) {
        int[][] array = new int[3][3];

        int i;
        for (i = 0; i < 3; ++i) {
            array[i][i] = 1;
        }

        for (i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j]);
            }

            System.out.println();
        }

    }
}

