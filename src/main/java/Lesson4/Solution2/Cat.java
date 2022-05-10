package Lesson4.Solution2;

public class Cat {
    private String name;
    private int appetite;
    private static boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public static boolean isSatiety() {
        return satiety;
    }

    public static void setSatiety(boolean satiety) {
        Cat.satiety = satiety;
    }

    public void satietyInfo() {
        if (isSatiety()) {
            System.out.println(name + "'s fed");
        }
        else {
            System.out.println(name + " is hungry");
        }
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        }
        else {
            System.out.println("No available food");
            satiety = false;
        }
    }
}
