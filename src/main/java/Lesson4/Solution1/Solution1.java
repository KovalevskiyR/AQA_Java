package Lesson4.Solution1;

public class Solution1 {
    public static void main(String[] args) {
        Cat bars = new Cat("Bars");  //HW from 1-4 points
        Dog rex = new Dog("Rex");
        bars.run(100);
        rex.run(100);
        bars.swim(100);
        rex.swim(5);
        Cat mars = new Cat("Mars");
        mars.run(200);
        Animal.count();
        Cat.count();
        Dog.count();
    }
}
