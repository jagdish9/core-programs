package programs.company.skidata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(101, "Iphone 70", 5),
                new Product(111, "Samsung F02", 10),
                new Product(121, "Oppo 12", 15),
                new Product(131, "Asus 20", 12),
                new Product(141, "Nokia 31", 10),
                new Product(151, "OnePlus 72", 20),
                new Product(161, "Redmi 90", 25),
                new Product(171, "RealMe 35", 30),
                new Product(181, "Sony s75", 8),
                new Product(191, "BlackBerrry L31", 21),
                new Product(141, "Nokia 31", 21)
        );

        //Find Top 5 Products by Sales
        products.stream()
                .collect(Collectors.groupingBy(
                        Product::getProductName,
                        Collectors.summingInt(Product::getQuantity)
                ))
                .forEach((k, v) -> {
                    System.out.println("Product Name: "+k + " Sold count: "+v);
                });
    }
}
