package ua.univer.lesson06;

import java.util.Arrays;

public class ProductList {
    private Product[] products;
    private int index;

    public ProductList(){
        products = new Product[3];
        products[0] = new Product("A", 1, 10);
        products[1] = new Product("B", 1, 5);
        products[2] = new Product("Cherry", 1, 50);
        index = 2;
    }

    public ProductList(Product[] products){
        this.products =products;
        index = products.length-1;

    }
    public boolean add(Product p){
        if (index == products.length-1){
            products = Arrays.copyOf(products, products.length*2);
        }
        products[++index] = p;
        return true;
    }
    public int size(){
        return index+1;
    }
    public Product getMaxPriceProduct(){
        Product maxPriceProduct = products[0];
        for (int i = 0; i < size(); i++) {
            if(products[i].getPrice() > maxPriceProduct.getPrice()){
                maxPriceProduct = products[i];
            }
        }
        return maxPriceProduct;
    }
    public void print(){
        for (int i = 0; i < size(); i++) {
            System.out.println(products[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Products: ");
        for (int i = 0; i < size(); i++) {
            sb.append(products[i]+", ");
        }
        return sb.toString();
    }
}
