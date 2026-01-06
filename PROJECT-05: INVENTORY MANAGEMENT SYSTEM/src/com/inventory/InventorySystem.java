package com.inventory;

import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {

        Inventory<Item> inventory = new Inventory<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nInventory System");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    inventory.addItem(new Item(name, quantity, price));
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();
                    Item toRemove = null;

                    for (Item item : inventory.getItems()) {
                        if (item.getName().equalsIgnoreCase(removeName)) {
                            toRemove = item;
                            break;
                        }
                    }

                    if (toRemove != null) {
                        inventory.removeItem(toRemove);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    inventory.viewItems();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting Inventory System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
