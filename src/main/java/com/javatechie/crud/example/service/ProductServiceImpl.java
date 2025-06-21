package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public String healthCheck() {
        return "Product service is running!";
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    @Override
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product removed !! " + id;
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setPrice(product.getPrice());
            return repository.save(existingProduct);
        }
        return null;
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return repository.findByNameContainingIgnoreCase(keyword);
    }
}
