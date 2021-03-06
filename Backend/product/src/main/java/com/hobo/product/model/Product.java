package com.hobo.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.json.simple.JSONObject;

import java.util.List;

@Document(collection = Product.COLLECTION_NAME)
public class Product {
    static final String COLLECTION_NAME="product";
    @Id
    String productId;
    String productName;
    String description;
    String category;
    String subCategory;
    String productBrand;
    List<String> productImage;
    //Object attributes;
    JSONObject attributes = new JSONObject();

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public void setAttributes(JSONObject attributes) {
        this.attributes = attributes;
    }

    public JSONObject getAttributes() {
        return attributes;
    }


    public List<String> getProductImage() {
        return productImage;
    }

    public void setProductImage(List<String> productImage) {
        this.productImage = productImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
