package com.spring.exceptionhandling.repo;

import com.spring.exceptionhandling.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
