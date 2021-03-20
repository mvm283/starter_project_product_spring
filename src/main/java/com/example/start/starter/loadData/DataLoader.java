package com.example.start.starter.loadData;

import com.example.start.starter.domain.Product;
import com.example.start.starter.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.objenesis.SpringObjenesis;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Product prd= new Product();
        prd.setName("Apple Phone 6");
        prd.setCategory("phone");
        prd.setQty(3.0);

        Product prd2= new Product();
        prd2.setName("Apple Phone 7");
        prd2.setCategory("phone");
        prd2.setQty(7.0);

        List<Product> retPrd= productRepository.saveAll(List.of(prd,prd2));
        for (Product printProd: retPrd) {
            System.out.println(" Test prod: " +printProd.toString() );
        }

    }
}
