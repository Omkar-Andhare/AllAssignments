package GenericPractice.BoundedTypeParameter;

import java.util.List;

public class MaxPriceFind {

    public static <T extends Product> T findMaxPriceProduct(List<T> products) {
        T maxPriceProduct = products.get(0);
        for (T product : products) {
            if (product.getPrice() > maxPriceProduct.getPrice()) {
                maxPriceProduct = product;
            }
        }
        return maxPriceProduct;
    }
}
