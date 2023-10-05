package org.example.streams;

public class Product {

    private String name;
    private double price;
    private int reference;


    public Product(String name, double price, int reference) {
        this.name = name;
        this.price = price;
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", reference=" + reference +
                '}';
    }

}
