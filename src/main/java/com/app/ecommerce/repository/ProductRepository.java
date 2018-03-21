package com.app.ecommerce.repository;

import com.app.ecommerce.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created by Praful Jha on 21/03/2018
 */

@Repository
public interface ProductRepository extends CrudRepository<Product,String> {
    List<Product> findAll();
    Product findProductByProductCode(String productCode);
}
