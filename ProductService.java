package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import java.util.List;
import java.util.Optional;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService() {
        this.productRepository = new ProductRepository();
    }

    // Create
    public Product create(String name, double price) {
        return productRepository.create(name, price);
    }

    // Read
    public Optional<Product> read(int id) {
        return productRepository.read(id);
    }

    // Update
    public Optional<Product> update(int id, String name, double price) {
        return productRepository.update(id, name, price);
    }

    // Delete
    public boolean delete(int id) {
        return productRepository.delete(id);
    }

    // List all products
    public List<Product> listAll() {
        return productRepository.listAll();
    }
}
