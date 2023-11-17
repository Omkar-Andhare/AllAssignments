package GenericPractice.BoundedTypeParameter;

import java.util.ArrayList;
import java.util.List;

import static GenericPractice.BoundedTypeParameter.MaxPriceFind.findMaxPriceProduct;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Iphone", 150000));
        productList.add(new Product("laptop", 70000));
        productList.add(new Product("Desktop", 50000));
        productList.add(new Product("Tab", 40000));

        Product maxPriceProduct = findMaxPriceProduct(productList);
        System.out.println("Product with max price is : " + maxPriceProduct);
    }
}
