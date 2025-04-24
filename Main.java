package com.example.product;

import com.example.product.controller.ProductController;
import com.example.product.model.Product;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        // Create
        productController.create("Laptop", 1200.50);
        productController.create("Phone", 800.75);
        productController.create("Tablet", 450.99);

        // List all products
        System.out.println("\nList all products:");
        productController.listAll();

        // Read
        System.out.println("\nRead product with ID 2:");
        productController.read(2).ifPresent(System.out::println);

        // Update
        System.out.println("\nUpdate product with ID 2:");
        productController.update(2, "Smartphone", 850.99);

        // Delete
        System.out.println("\nDelete product with ID 1:");
        productController.delete(1);

        // List all products after update and delete
        System.out.println("\nList all products after update and delete:");
        productController.listAll();
    }
}
