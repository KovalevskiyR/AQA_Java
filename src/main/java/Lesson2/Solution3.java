package Lesson2;

public class Solution3 {
    public Solution3() {
    }

    public static boolean checkPositiveNumber(int a) {
        boolean checkNumber = 0 <= a;
        return checkNumber;
    }

    public static void main(String[] args) {
        System.out.println(checkPositiveNumber(10));
    }
}
