package com.GroceryStore;

import com.GroceryStore.Products.Drink;
import com.GroceryStore.Products.Fruit;
import com.GroceryStore.Products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<Product> inventory = new ArrayList<>();
    private int balance = 500_00;
    private String name;
    private Scanner scanner = new Scanner(System.in);

    public Store(String name) {
        this.name = name;
    }

    // TODO: add the given product to the collection.
    public void addToInventory(Product product) {
        inventory.add(product);

    }

    // TODO: Drink version
    public void addToInventory() {
        System.out.println("What is the name of the Drink?");

        String name = scanner.nextLine();

        System.out.println("How much will the Drink cost (in cents):");

        String price = scanner.nextLine();

        System.out.println("Enter the id number of the Drink:");

        String id = scanner.nextLine();

        System.out.println("Enter a product description:");

        String description =  scanner.nextLine();



        Drink drink = new Drink();
        addToInventory(drink);
    };

    // TODO: Friut version
    public void addToInventory() {
        Fruit fruit = new Fruit();
        addToInventory(fruit);
    };

}
