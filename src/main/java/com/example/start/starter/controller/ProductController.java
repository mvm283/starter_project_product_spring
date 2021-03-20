package com.example.start.starter.controller;

import com.example.start.starter.domain.Product;
import com.example.start.starter.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/product")
public interface ProductController {

    public Product getProductById(@PathVariable("id") Long id);

    public ResponseEntity getAllProducts();

    public ResponseEntity saveProduct(@RequestBody Product product);

    public ResponseEntity updateProduct(@RequestBody Product product);

    public void deleteProduct(@PathVariable(name = "id") Long id);
}

