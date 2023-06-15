package classes;

import java.io.PrintStream;

public class productText {
    public static void main(String[] args) {
        product product = new product();
        product.setId(1234);
        product.setName("Laptop");
        product.setDescription("Apple Macbook Pro 2022 M2 çipli");
        product.setPrice(1850.0);
        product.setStockAmount(34);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.description(product);
        productManager.Id(product);
        productManager.stock(product);
        productManager.fiyat(product);
        productManager.name(product);
        System.out.println(product.getName());

    }
}
