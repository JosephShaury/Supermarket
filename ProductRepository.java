package com.example.product.repository;

import com.example.product.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private List<Product> productList = new ArrayList<>();
    private int currentId = 1;

    // Create
    public Product create(String name, double price) {
        Product product = new Product(currentId++, name, price);
        productList.add(product);
        return product;
    }

    // Read
    public Optional<Product> read(int id) {
        return productList.stream().filter(product -> product.getId() == id).findFirst();
    }

    // Update
    public Optional<Product> update(int id, String name, double price) {
        Optional<Product> productOpt = read(id);
        productOpt.ifPresent(product -> {
            product.setName(name);
            product.setPrice(price);
        });
        return productOpt;
    }

    // Delete
    public boolean delete(int id) {
        Optional<Product> productOpt = read(id);
        productOpt.ifPresent(productList::remove);
        return productOpt.isPresent();
    }

    // List all products
    public List<Product> listAll() {
        return new ArrayList<>(productList);
    }
}

