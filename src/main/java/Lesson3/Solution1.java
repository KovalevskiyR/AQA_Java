package Lesson3;

public class Solution1 {
    public static void main(String[] args) {
        Employee user1 = new Employee("Bovtun Igor", "qa",
                "bovtun@gmail.com", "+380662013656", 800, 20);
        user1.getInfo();
        Employee[] users = new Employee[5];
        users[0] = new Employee("Aleshko Evgenii", "developer",
                "aleshko333@gmail,com", "+380635653340", 4500, 45);
        users[1] = new Employee("Andreev Alexander", "ba",
                "alex232@gmail,com", "+380732327890", 2500, 30);
        users[2] = new Employee("Anisimova Olena", "developer",
                "anisimova@gmail,com", "+380505650090", 4500, 30);
        users[3] = new Employee("Kornienko Daniil", "devops",
                "kornienko2323@gmail,com", "+380635657780", 3400, 34);
        users[4] = new Employee("Tom Johnson", "designer",
                "johnson@gmail,com", "+380666509871", 2000, 42);
        Employee.getAgeUnder40(users);
    }
}
