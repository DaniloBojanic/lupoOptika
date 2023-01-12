package org.lupo.service;

import org.lupo.enumerations.ProductGender;
import org.lupo.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
    Product findOneById(Long id);
    List<Product> getAllProductsFromUser(Long id);
    List<Product> findByIsNew(boolean isNew);
    List<Product> findByOnSale(boolean onSale);
    List<Product> findByGenderMan();
    List<Product> findByGenderWoman();
    List<Product> findByGenderKid();
    List<Product> findByGenderUnisex();



}
