package Lesson2;

public class Solution2 {

    public static void checkPositiveNumber(int a) {
        String checkNumber = (0 <= a )? "Positive" : "Negative";
        System.out.println(checkNumber);
    }

    public static void main(String[] args) {
        checkPositiveNumber(0);
    }
}
