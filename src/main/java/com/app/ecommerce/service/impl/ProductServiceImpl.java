package com.app.ecommerce.service.impl;

import com.app.ecommerce.dao.ProductDao;
import com.app.ecommerce.domain.Product;
import com.app.ecommerce.repository.ProductRepository;
import com.app.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by Praful Jha on 21/03/2018
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {

        return  productRepository.findAll();
    }

    @Override
    public Product getProductByCode(String productCode) {

        return productRepository.findProductByProductCode(productCode);
    }

    @Override
    public Product addProduct(Product product) {

       Product product1 =  productRepository.save(product);

        return product1;
    }
}
