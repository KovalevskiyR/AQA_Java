package Lesson6;

import static Lesson6.ArrayCheck.arrCheck;

public class Solution1 {
    public static void main(String[] args) {
        String[][] arr = new String[][]
                {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            int result = arrCheck(arr);
            System.out.println(result);
        } catch (MyArraySizeException e) {
            System.out.println("Array's size exceeded");
        } catch (MyArrayDataException e) {
            System.out.println("Incorrect array's value, error in: " + e.getI() + "x" + e.getJ());
        }
    }
}
