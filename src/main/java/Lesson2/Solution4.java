package Lesson2;

public class Solution4 {

    public static void printString(String string, int number) {
        for (int i = 0; i < number; ++i) {
            System.out.println(string);
        }

    }

    public static void main(String[] args) {
        printString("hello", 6);
    }
}
