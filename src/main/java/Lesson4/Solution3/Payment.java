package Lesson4.Solution3;

import java.util.Scanner;

public class Payment {
    private String name;
    private int cost;
    private Product[] productsArray;

    public Payment(String name) {
        this.name = name;
    }

    public void setPayment() {
        System.out.print("Input amount of product: ");
        Scanner br = new Scanner(System.in);
        int amount = br.nextInt();
        productsArray = new Product[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Product " + (i + 1) + ": ");
            System.out.print("Product name: ");
            String str_name = br.next();
            System.out.print("Cost: ");
            int prod_cost = br.nextInt();
            productsArray[i] = new Product(str_name, prod_cost);
            this.cost += productsArray[i].productCost;
        }
    }

    public void showProducts() {
        for (Product product : productsArray) {
            System.out.printf("Product name is: %s", product.productName);
            System.out.printf("Product cost is: %d", product.productCost);
            System.out.println("-----------------------------------------");
        }
    }

    private class Product {
        private String productName;
        private int productCost;

        public Product(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getProductCost() {
            return productCost;
        }

        public void setProductCost(int productCost) {
            this.productCost = productCost;
        }
    }
}