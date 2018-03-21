package com.app.ecommerce.service;

import com.app.ecommerce.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by Praful Jha on 21/03/2018
 */


public interface ProductService {

    List<Product> getAllProducts();
    Product getProductByCode(String productCode);
    Product addProduct(Product product);

}
