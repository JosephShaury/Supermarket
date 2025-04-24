package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

import java.util.List;
import java.util.Optional;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        this.productService = new ProductService();
    }

    // Create
    public Product create(String name, double price) {
        return productService.create(name, price);
    }

    // Read
    public Optional<Product> read(int id) {
        return productService.read(id);
    }

    // Update
    public Optional<Product> update(int id, String name, double price) {
        return productService.update(id, name, price);
    }

    // Delete
    public boolean delete(int id) {
        return productService.delete(id);
    }

    // List all products
    public void listAll() {
        List<Product> products = productService.listAll();
        products.forEach(System.out::println);
    }
}
