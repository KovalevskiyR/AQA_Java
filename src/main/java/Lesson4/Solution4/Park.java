package Lesson4.Solution4;

import java.util.Scanner;

public class Park {
    private Entertainment[] entArray;
    private int cost;

    public void setEntertainment() {
        System.out.print("Input amount of attractions: ");
        Scanner br = new Scanner(System.in);
        int amount = br.nextInt();
        entArray = new Park.Entertainment[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Attraction " + (i + 1) + ": ");
            System.out.print("Attraction name: ");
            String ent_name = br.next();
            System.out.print("Cost: ");
            int ent_cost = br.nextInt();
            System.out.print("Attraction work time: ");
            String workTime = br.next();
            entArray[i] = new Park.Entertainment(ent_name, ent_cost, workTime);
            this.cost += entArray[i].costAttr;
        }
    }

    public void showAttractions() {
        for (Entertainment entertainment : entArray) {
            System.out.printf("Attraction name is: %s\n", entertainment.name);
            System.out.printf("Attraction cost is: %d\n", entertainment.costAttr);
            System.out.printf("Attraction work time is: %s\n", entertainment.workTime);
            System.out.println("-----------------------------------------");
        }
    }

    private class Entertainment {
        private String name;
        private int costAttr;
        private String workTime;

        public Entertainment(String name, int cost, String workTime) {
            this.name = name;
            this.costAttr = cost;
            this.workTime = workTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCostAttr() {
            return costAttr;
        }

        public void setCostAttr(int costAttr) {
            this.costAttr = costAttr;
        }

        public String getWorkTime() {
            return workTime;
        }

        public void setWorkTime(String workTime) {
            this.workTime = workTime;
        }
    }
}
