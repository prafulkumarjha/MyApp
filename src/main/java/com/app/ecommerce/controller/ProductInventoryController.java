package com.app.ecommerce.controller;

import com.app.ecommerce.domain.Product;
import com.app.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * created by Praful Jha on 24/03/2018
 */

@Controller
@RequestMapping("/admin/productInventory")
public class ProductInventoryController {

    private Path path;

    @Autowired
    ProductService productService;

    @RequestMapping()
    public ModelAndView productInventoryPage(ModelAndView model) throws IOException {

        List<Product> products = productService.getAllProducts();

        model.addObject("products",products);

        model.setViewName("productInventory");

        // return "viewProduct";
        return model;
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.GET)
    public String goToAddProductPage(Model model) {

        model.addAttribute("product",new Product());

        return "addProduct";
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "addProduct";
        }

      Product product1 =  productService.addProduct(product);

        MultipartFile productImage = product.getProductImage();

        path = Paths.get("/Praful/Workspaces/MyEcommerceApp/src/main/resources/images/"+product.getProductCode()+".png");

        if(productImage != null && !productImage.isEmpty()) {
            try{
                productImage.transferTo(new File(path.toString()));
            }
            catch (Exception ex) {
                System.out.println("Error saving image into File System "+ex.getMessage());
            }
        }

        System.out.println(product1.toString());

        return "redirect:/products/admin/productInventory";
    }

    @RequestMapping(value = "/deleteProduct/{productCode}")
    public String deleteProduct(@PathVariable String productCode) {

        int val =  productService.deleteProduct(productCode);
        System.out.println("returned value from delete is : "+val);

        return "redirect:/products/admin/productInventory";
    }


    @RequestMapping(value = "/editProduct/{productCode}", method = RequestMethod.GET)
    public String goToEditProductPage(@PathVariable String productCode, Model model) {

        model.addAttribute("product",productService.getProductByCode(productCode));

        return "addProduct";
    }

}
