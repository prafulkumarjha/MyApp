package com.app.ecommerce.dao;

import com.app.ecommerce.domain.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Praful Jha on 18/03/2018
 */
public class ProductDao {

    private List<Product> products = new ArrayList<Product>();

    private static ProductDao _instance = null ;
    private ProductDao() {
        Product prod1 = new Product();
        prod1.setProductCode("1");
        prod1.setProductName("Guitar");
        prod1.setProductCategory("Instrument");
        prod1.setProductCondition("New");
        prod1.setProductDescription("This is a Fender Street Guitar");
        prod1.setProductPrice(1200);
        prod1.setUnitInStock(2);
        prod1.setProductStatus("Active");
        prod1.setBrandName("Fender");
        products.add(prod1);

        Product prod2 = new Product();
        prod2.setProductCode("2");
        prod2.setProductName("Record");
        prod2.setProductCategory("Record");
        prod2.setProductCondition("New");
        prod2.setProductDescription("This is an awesome mix of record of 20th century");
        prod2.setProductPrice(25);
        prod2.setUnitInStock(12);
        prod2.setProductStatus("Active");
        prod2.setBrandName("EMI");
        products.add(prod2);

        Product prod3 = new Product();
        prod3.setProductCode("3");
        prod3.setProductName("Speaker");
        prod3.setProductCategory("Accessory");
        prod3.setProductCondition("New");
        prod3.setProductDescription("This is speaker");
        prod3.setProductPrice(95);
        prod3.setUnitInStock(9);
        prod3.setProductStatus("Active");
        prod3.setBrandName("Creative");
        products.add(prod3);

    }

    public static ProductDao getInstance() {

        if(_instance == null)
            _instance =  new ProductDao();

        return _instance;

    }

    public List<Product> getProductList() {

        return products;


    }

    public Product getProductByCode(String productCode) {
        for(Product product: products) {
            if(product.getProductCode().equals(productCode))
                return product;
        }

        return null;
    }
}
