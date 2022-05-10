package Lesson2;

public class SolutionWithLeapYear {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2012));
    }
}
