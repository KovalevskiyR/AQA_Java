package Lesson4.Solution1;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static void count() {
        System.out.printf("Котов: %d\n", catCount);
    }


    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.printf("%s пробежал %d метров\n", getName(), distance);
        } else {
            System.out.println("Кот не может столько пробежать\n");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
