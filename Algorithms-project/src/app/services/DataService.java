package app.services;

import app.data.Product;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataService {

    public int sortData(List<Product> list, double price) {
        Comparator<Product> comparator =
                Comparator.comparingDouble(Product::getPrice);
        return Collections.binarySearch(list, new Product(null, price),
                comparator);
    }
}
