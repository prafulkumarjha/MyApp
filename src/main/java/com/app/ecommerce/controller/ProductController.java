package com.app.ecommerce.controller;

import com.app.ecommerce.dao.ProductDao;
import com.app.ecommerce.domain.Product;
import com.app.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

/**
 * created by Praful Jha on 18/03/2018
 */
@Controller
@RequestMapping("/products")
public class ProductController {


    @Autowired
    ProductService productService;


    @RequestMapping("")
    public String getProducts( Model model) {

        List<Product> products = productService.getAllProducts();

        model.addAttribute("products",products);
        return "productList";
    }

    @RequestMapping(value = "/{productCode}")
    public ModelAndView viewProduct(@PathVariable String productCode, ModelAndView model) throws IOException {

        Product product = productService.getProductByCode(productCode);
        model.addObject("product",product);
        model.setViewName("viewProduct");

        // return "viewProduct";
        return model;
    }

    @RequestMapping(method = RequestMethod.POST)

    public String addProduct(@RequestBody Product product) {

        productService.addProduct(product);

        return "productAdded";

    }

}
