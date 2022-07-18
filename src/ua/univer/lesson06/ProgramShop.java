package ua.univer.lesson06;

public class ProgramShop {
    public static void main(String[] args) {
        Currency.usd = 36.0;
        Product p1 = new Product("Banana", 1, 40);
        Product p2 = new Product("Apple");

        System.out.println(p1);
        System.out.println(p2);
        Currency.usd = 40.0;
        System.out.println(p1);
        System.out.println(p2);

        Product[] arrprod = {p1,p2};
        ProductList products = new ProductList(arrprod);
        products.add(new Product("Qiwi", 1, 70));
        products.print();
        Product maxPriceProduct = products.getMaxPriceProduct();
        System.out.println(maxPriceProduct);
        System.out.println(products);
        SwimPool.swim(new Dog());
    }
}
