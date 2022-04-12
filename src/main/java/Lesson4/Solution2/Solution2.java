package Lesson4.Solution2;

public class Solution2 {
    public static void main(String[] args) {
        Plate plate = new Plate(30);  //HW 5 point
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Murzik", 5);
        cats[1] = new Cat("Mars", 5);
        cats[2] = new Cat("Tima", 5);
        cats[3] = new Cat("Kesha", 5);
        cats[4] = new Cat("Major", 5);

        for (Cat i : cats) {
            i.eat(plate);
            i.satietyInfo();
        }
        plate.info();
        plate.increaseFood(10);
        plate.info();
    }
}
