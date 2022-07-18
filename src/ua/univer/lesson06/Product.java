package ua.univer.lesson06;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String name;
    private double weight;
    private double price;

    public Product(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
  //      this.price = price;
        this.setPrice(price);
    }

    public Product(String name) {
//        this.name = name;
//        this.weight = 1;
//        this.price = 25;
        this(name, 1, 25);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException();
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.weight, weight) == 0 && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price);
    }

    public double getPrice() {
        return this.price*Currency.usd;
    }

    public void setPrice(double price) {
        this.price = price/Currency.usd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + getPrice() +
                '}';
    }
}
