package com.example.service;

import com.example.dto.Product;
import com.example.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;

@Service
@RequiredArgsConstructor

public class ProductService {
    private final ProductRepository productRepository;

    public void add(Product product) {
//        log.debug("Adding person");
        if (product.getId() == null) {
            product.setId(UUID.randomUUID());
        }
        productRepository.add(product);
    }

    public ConcurrentLinkedDeque<Product> findAll() {
//        log.debug("findAll");
        return productRepository.findAll();
    }
}
