package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main(String[] args) {

        System.out.println(" --- Demo : filter, map et collect ");
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("iPhone",1000, 123456),
                new Product("table",500, 109876),
                new Product("PC",900, 103056),
                new Product("SSD",100, 109456),
                new Product("PS5",600, 193436)
        ));


        List<Product> listModifie = products.stream()
                .filter(product -> product.getReference()>109456)
                .map(product -> {
                    product.setPrice(product.getPrice()*1.20);
                    return product;
                })
                .collect(Collectors.toList());

        listModifie.stream().forEach(System.out::println);

        System.out.println("Demo : toMap ");

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Cart cart3 = new Cart();

        cart1.setProductList(Arrays.asList(products.get(0)));
        cart2.setProductList(Arrays.asList(products.get(1), products.get(2)));
        cart3.setProductList(Arrays.asList(products.get(3),products.get(4)));


        List<Cart> carts = new ArrayList<>(Arrays.asList(cart1,cart2,cart3));


        Product[] products1 = carts.stream()
                .flatMap(cart -> cart.getProductList().stream())
                .filter(product -> product.getReference()>109500)
                .map(product -> {
                    product.setPrice(product.getPrice()*1.50);
                    return product;
                }).toArray(Product[]::new);


        for (Product product : products1) {
            System.out.println(product);
        }
        Arrays.stream(products1).forEach(System.out::println);

        System.out.println(" ======= toMap ========");

        Map<String, Product> productMap = products.stream().
                collect(Collectors.toMap(Product::getName, Function.identity()));

        System.out.println(productMap);

        System.out.println(" ======= mapToDouble & sum() demo ==== ");


        double totalPrice = products.stream()
                .mapToDouble(product -> product.getPrice())
                .sum();

        System.out.println("La somme des prix des produits est de " + totalPrice);


    }
}
