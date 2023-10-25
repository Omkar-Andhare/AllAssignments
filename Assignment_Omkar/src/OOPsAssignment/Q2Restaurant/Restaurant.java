package OOPsAssignment.Q2Restaurant;

import java.util.ArrayList;
import java.util.List;

class Restaurant {
    public List<MenuItem> menu = new ArrayList<>();

    public void addItem(String name, double price, int rating) {
        MenuItem item = new MenuItem(name, price, rating);
        menu.add(item);
    }

    public void removeItem(String name) {
        MenuItem itemToRemove = null;
        for (MenuItem item : menu) {
            if (item.getName().equals(name)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            menu.remove(itemToRemove);
            System.out.println("Item removed: " + name);
        } else {
            System.out.println("Item not found: " + name);
        }
    }

    public double calculateAverageRating() {
        if (menu.isEmpty()) {
            return 0.0; // No items in the menu
        }

        int totalRating = 0;
        int totalItemsWithRating = 0;
        for (MenuItem item : menu) {
            int rating = item.getRating();
            if (rating > 0) {
                totalRating += rating;
                totalItemsWithRating++;
            }
        }

        if (totalItemsWithRating == 0) {
            return 0.0; // No items with ratings
        }

        return (double) totalRating / totalItemsWithRating;
    }

    public List<MenuItem> displayMenu() {
        return menu;
    }
}