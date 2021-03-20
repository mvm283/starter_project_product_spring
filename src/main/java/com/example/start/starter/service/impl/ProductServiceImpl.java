package com.example.start.starter.service.impl;

import com.example.start.starter.domain.Product;
import com.example.start.starter.repository.ProductRepository;
import com.example.start.starter.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
    private Logger LOG= LoggerFactory.getLogger(ProductService.class);

    @Autowired
    ProductRepository repoProduct;
    @Override
    public Product getProductById(Long id){
        LOG.info("Geting the Product with id : "+id);
        return repoProduct.findById(id).get();
    }
    @Override
    public Product saveProduct(Product product){
        try {
            return repoProduct.save(product);
        }
        catch (Exception e){
            LOG.info(String.format("An Error occured during product saving %s ",e.getMessage()));

        }
        return new Product();
    }
    @Override
    public List<Product> getAllProduct(){
        LOG.info("Geting all the Products");
        return repoProduct.findAll();
    }
    @Override
    public Product updateProduct(Product product){
        Product prod4Update= repoProduct.getOne(product.getId());
        try {
                prod4Update.setName(product.getName());
                prod4Update.setCategory(product.getCategory());
                prod4Update.setQty(product.getQty());
                return repoProduct.save(prod4Update);
        }
        catch (Exception e){
            LOG.info(String.format("An Error occured during product updating %s ",e.getMessage()));
        }
        return prod4Update;
    }
    @Override
    public void deleteProduct(Long id){
        try {
            repoProduct.deleteById(id);
        }catch (Exception e){
            LOG.info(String.format("An Error occured during product deleting %s ",e.getMessage()));
        }
    }
}
