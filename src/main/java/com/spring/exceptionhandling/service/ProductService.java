package com.spring.exceptionhandling.service;

import com.spring.exceptionhandling.entity.Product;
import com.spring.exceptionhandling.exception.ProductNotFoundException;
import com.spring.exceptionhandling.repo.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId));
    }

}
