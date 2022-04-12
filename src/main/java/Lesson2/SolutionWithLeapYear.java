package Lesson2;

public class SolutionWithLeapYear {

    public static boolean isLeapYear(int year) {
        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return isLeap;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2012));
    }
}
