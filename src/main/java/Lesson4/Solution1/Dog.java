package Lesson4.Solution1;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static void count() {
        System.out.printf("Собак: %d\n", dogCount);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.printf("%s пробежал %d метров\n", getName(), distance);
        }
        else {
            System.out.println("Собака не может столько пробежать\n");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.printf("%s проплыл %d метров\n", getName(), distance);
        }
        else {
            System.out.println("Собака не может столько пробежать\n");
        }
    }
}
