package Lesson5.Solution2;

public class Solution2 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Box<Apple> box1 = new Box<Apple>(apple1, apple2);
        box1.add(apple3);
        Box<Orange> box2 = new Box<Orange>(orange1);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));
        Box<Orange> box3 = new Box<>();
        box2.transfer(box3);
    }
}
