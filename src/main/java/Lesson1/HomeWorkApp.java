package Lesson1;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -1;
        int b = 0;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers() {
        int a = 4;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
