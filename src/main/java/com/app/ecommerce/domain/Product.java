package com.app.ecommerce.domain;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * created by Praful Jha on 18/03/2018
 */


@Entity
public class Product {

    @NotEmpty(message = "Product Name can't be Empty")
    private String productName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productCode;

    private String productCategory;
    private String productDescription;

    @Min(value = 0, message = "Price can't be less than Zero")
    private double productPrice;
    private String productCondition;
    private String productStatus;
    private String brandName;

    @Min(value = 0, message = "Unit can't be less than Zero")
    private int unitInStock;

    @Transient
    private MultipartFile productImage;

    public Product() {
    }

    public Product(String productCode, String productName, String productCategory, String productDescription, double productPrice, String productCondition, String productStatus, String brandName, int unitInStock) {
        this.productCode = productCode;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productCondition = productCondition;
        this.productStatus = productStatus;
        this.brandName = brandName;
        this.unitInStock = unitInStock;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productCondition='" + productCondition + '\'' +
                ", productStatus='" + productStatus + '\'' +
                ", brandName='" + brandName + '\'' +
                ", unitInStock=" + unitInStock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (Double.compare(product.productPrice, productPrice) != 0) return false;
        if (unitInStock != product.unitInStock) return false;
        if (!productName.equals(product.productName)) return false;
        if (!productCode.equals(product.productCode)) return false;
        if (!productCategory.equals(product.productCategory)) return false;
        if (productDescription != null ? !productDescription.equals(product.productDescription) : product.productDescription != null)
            return false;
        if (productCondition != null ? !productCondition.equals(product.productCondition) : product.productCondition != null)
            return false;
        if (!productStatus.equals(product.productStatus)) return false;
        return brandName != null ? brandName.equals(product.brandName) : product.brandName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productName.hashCode();
        result = 31 * result + productCode.hashCode();
        result = 31 * result + productCategory.hashCode();
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        temp = Double.doubleToLongBits(productPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (productCondition != null ? productCondition.hashCode() : 0);
        result = 31 * result + productStatus.hashCode();
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + unitInStock;
        return result;
    }
}
