package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Product;

import java.util.List;

public interface ProductService {
    String healthCheck();
    Product saveProduct(Product product);
    List<Product> saveProducts(List<Product> products);
    List<Product> getProducts();
    Product getProductById(int id);
    Product getProductByName(String name);
    Product updateProduct(Product product);
    String deleteProduct(int id);
    List<Product> searchProducts(String keyword); // ✅ for v1.1
    List<Product> searchProducts(String keyword, String category);//for v2.1

}
