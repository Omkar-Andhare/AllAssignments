package OOPsAssignment.Q2Restaurant.Controller;

import OOPsAssignment.Q2Restaurant.serviceImpl.Restaurant;

import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        boolean flag = true;
        while (flag) {
            System.out.println("1. Adding Item");
            System.out.println("2. Calculate average of rating");
            System.out.println("3. display menu");
            System.out.println("4. Exit");

            System.out.println("-------------------Enter the choice----------------");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the Item name: ");
                    String itemNAme = scanner.next();
                    System.out.println("Enter the price: ");
                    double price = scanner.nextDouble();
                    System.out.println("Enter the Rating name: ");
                    int rating = scanner.nextInt();
                    restaurant.addItem(itemNAme, price, rating);
                    break;
                }
                case 2: {
                    System.out.println( restaurant.calculateAverageRating());
                    break;
                }
                case 3: {
                    System.out.println(restaurant.displayMenu());
                    break;
                }
                case 4: {
                    flag = false;
                    System.out.println("-----------Exited successfully Visit Again-----------");
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}
