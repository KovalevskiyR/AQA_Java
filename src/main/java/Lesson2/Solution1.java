package Lesson2;

public class Solution1 {

    public static boolean checkNumbersRange(int a, int b) {
        boolean checkRange = a + b >= 10 && a + b <= 20;
        return checkRange;
    }

    public static void main(String[] args) {
        System.out.println(checkNumbersRange(2, 5));
    }
}
