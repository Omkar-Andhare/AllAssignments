package OOPsAssignment.Q2Restaurant.Model;

public class MenuItem {
    private String name;
    private double price;
    private int rating;

    public MenuItem(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", Price: " + price + ", Rating: " + rating;
    }
}
