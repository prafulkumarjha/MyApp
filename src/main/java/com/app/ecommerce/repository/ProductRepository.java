package com.app.ecommerce.repository;

import com.app.ecommerce.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * created by Praful Jha on 21/03/2018
 */

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

    List<Product> findAll();
    Product findProductByProductCode(String productCode);

    @Transactional
    int deleteByProductCode(String productCode);
}
