package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);

    // ✅ Add this new method for /products/search
    List<Product> findByNameContainingIgnoreCase(String keyword);
    List<Product> findByNameContainingIgnoreCaseAndCategoryContainingIgnoreCase(String keyword, String category);

}
