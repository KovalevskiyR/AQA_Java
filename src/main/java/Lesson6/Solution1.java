package Lesson6;

import static Lesson6.ArrayCheck.arrCheck;

public class Solution1 {
    public static void main(String[] args){
        String[][] arr = new String[][]
                {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "a"}};
        int result = 0;
        try {
            result = arrCheck(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
