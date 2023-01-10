package org.lupo.model;

import org.lupo.enumerations.ProductGender;

import javax.persistence.*;
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private boolean onSale;
    @Column
    private boolean isNew;
    @Column
    private double discountPercentage;
    @Column
    private double priceBefore;
    @Column
    private double priceAfter;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private double price;
    @Enumerated(EnumType.STRING)
    private ProductGender productGender;
    @ManyToOne
    private User user;

    public Product(){
    }

    public Product(Long id, boolean onSale, boolean isNew, double discountPercentage, double priceBefore, double priceAfter,
                   String name, String description, double price, ProductGender productGender, User user) {
        this.id = id;
        this.onSale = onSale;
        this.isNew = isNew;
        this.discountPercentage = discountPercentage;
        this.priceBefore = priceBefore;
        this.priceAfter = priceAfter;
        this.name = name;
        this.description = description;
        this.price = price;
        this.productGender = productGender;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
    public String getFormattedDiscountPercentage() {
        return String.format("%.0f%%", discountPercentage);
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", onSale=" + onSale +
                ", isNew=" + isNew +
                ", discountPercentage='" + discountPercentage + '\'' +
                ", priceBefore=" + priceBefore +
                ", priceAfter=" + priceAfter +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", productGender=" + productGender +
                ", user=" + user +
                '}';
    }
}
