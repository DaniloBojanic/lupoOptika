package org.lupo.web.dto;

import org.lupo.enumerations.ProductGender;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ProductDTO {

    private Long id;

    private boolean onSale;

    private boolean isNew;

    private double discountPercentage;

    private double priceBefore;

    private double priceAfter;

    private String name;

    private String description;

    private double price;
    @Enumerated(EnumType.STRING)
    private ProductGender productGender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getPriceBefore() {
        return priceBefore;
    }

    public void setPriceBefore(double priceBefore) {
        this.priceBefore = priceBefore;
    }

    public double getPriceAfter() {
        return priceAfter;
    }

    public void setPriceAfter(double priceAfter) {
        this.priceAfter = priceAfter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductGender getProductGender() {
        return productGender;
    }

    public void setProductGender(ProductGender productGender) {
        this.productGender = productGender;
    }
}
