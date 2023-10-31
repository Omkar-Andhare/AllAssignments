package OOPsAssignment.Q2Restaurant.service;

import OOPsAssignment.Q2Restaurant.Model.MenuItem;

import java.util.List;

public interface IRestaurantOperation {
    public void addItem(String name, double price, int rating);

    public void removeItem(String name);

    public double calculateAverageRating();

    public List<MenuItem> displayMenu();
}
