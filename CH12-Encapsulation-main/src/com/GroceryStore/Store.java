package com.GroceryStore;

import com.GroceryStore.Products.Drink;
import com.GroceryStore.Products.Fruit;
import com.GroceryStore.Products.Product;

import java.util.ArrayList;
import java.util.Arrays;
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
    public void addDrinkToInventory() {
        System.out.println("What is the name of the Drink?");

        String name = scanner.nextLine();

        System.out.println("How much will the Drink cost (in cents):");

        String price = scanner.nextLine();

        System.out.println("Enter the id number of the Drink:");

        String id = scanner.nextLine();

        System.out.println("Enter a product description:");

        String description =  scanner.nextLine();

        System.out.println("What is the total volume of this Drink?");

        String volume = scanner.nextLine();

        System.out.println("How will this drink be measured?\n" + Arrays.toString(Drink.UNITS));

        String units = scanner.nextLine();

        Drink drink = new Drink(name, Integer.parseInt(price), id, description, Integer.parseInt(volume), units);
        addToInventory(drink);
    };

    // TODO: Friut version
    public void addFruitToInventory() {

        System.out.println("What is the name of the Fruit?");

        String name = scanner.nextLine();

        System.out.println("How much will the Fruit cost (in cents):");

        String price = scanner.nextLine();

        System.out.println("Enter the id number of the Fruit:");

        String id = scanner.nextLine();

        System.out.println("Enter a product description:");

        String description =  scanner.nextLine();

        System.out.println("What is the hardness of this Fruit?");

        String hardness = scanner.nextLine();

        System.out.println("Is this Fruit organic?\n(y)es\n(n)o");

        String organic = scanner.nextLine();

        boolean isOrganic = false;

        switch (organic) {
            case "y" :
                isOrganic = true;
        }

        Fruit fruit = new Fruit(name, Integer.parseInt(price), id, description, Integer.parseInt(hardness), isOrganic);
        addToInventory(fruit);
    };

}
