package com.example.start.starter.controller.impl;

import com.example.start.starter.controller.ProductController;
import com.example.start.starter.domain.Product;
import com.example.start.starter.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
public class ProductControllerImpl implements ProductController {

    @Autowired
    ProductService serviceProduct;

    @GetMapping("{id}")
    @Override
    public Product getProductById(@PathVariable("id") Long id) {
        return serviceProduct.getProductById(id);
    }

    @GetMapping("/")
    @Override
    public ResponseEntity getAllProducts() {
        return new ResponseEntity(serviceProduct.getAllProduct(), HttpStatus.OK);
    }

    @PostMapping
    @Override
    public ResponseEntity saveProduct(@RequestBody Product product) {
        return new ResponseEntity(serviceProduct.saveProduct(product), HttpStatus.OK);
    }

    @PutMapping
    @Override
    public ResponseEntity updateProduct(@RequestBody Product product) {
        return new ResponseEntity(serviceProduct.updateProduct(product), HttpStatus.OK);
    }

    @DeleteMapping(path = "{id}")
    @Override
    public void deleteProduct(@PathVariable(name = "id") Long id) {
          serviceProduct.deleteProduct(id);
    }
}

