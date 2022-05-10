package Lesson4.Solution1;

public abstract class Animal {
    private String name;
    private static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static void count() {
        System.out.printf("Животных: %d\n", animalCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}
