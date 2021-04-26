package com.example.repository;

import com.example.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentLinkedDeque;

@Repository

public class ProductRepository {
    private final static ConcurrentLinkedDeque<Product> storage = new ConcurrentLinkedDeque<Product>();

    public void add(Product product) {
        storage.add(product);
    }

    public ConcurrentLinkedDeque<Product> findAll() {
        return storage;
    }
}
