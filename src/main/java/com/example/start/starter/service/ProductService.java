package com.example.start.starter.service;

import com.example.start.starter.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService  {
    public Product getProductById(Long id);
    public Product saveProduct(Product product);
    public List<Product> getAllProduct();
    public Product updateProduct(Product product);
    public void deleteProduct(Long id);
}
