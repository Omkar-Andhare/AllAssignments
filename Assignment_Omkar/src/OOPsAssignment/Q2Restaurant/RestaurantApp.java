package OOPsAssignment.Q2Restaurant;

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

            System.out.println("-------------------ENter the choice----------------");
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
                    System.out.println("-----------exited successfully------------");
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                }

            }
        }


//        restaurant.addItem("Burger", 5.99, 4);
//        restaurant.addItem("Pizza", 8.99, 5);
//        restaurant.addItem("Pasta", 7.49, 3);
//
//        for (MenuItem item : restaurant.displayMenu()) {
//            System.out.println(item);
//        }
//        restaurant.removeItem("Pizza");
//
//        System.out.println("Menu Items:");
//        for (MenuItem item : restaurant.displayMenu()) {
//            System.out.println(item);
//        }
//
//        double averageRating = restaurant.calculateAverageRating();
//        System.out.println("Average Rating: " + averageRating);
    }
}
