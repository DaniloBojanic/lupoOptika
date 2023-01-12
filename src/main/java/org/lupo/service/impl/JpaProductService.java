package org.lupo.service.impl;

import org.lupo.enumerations.ProductGender;
import org.lupo.model.Product;
import org.lupo.repository.ProductRepository;
import org.lupo.service.ProductService;
import org.lupo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JpaProductService implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserService userService;
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findOneById(Long id) {
        return productRepository.findOneById(id);
    }

    @Override
    public List<Product> getAllProductsFromUser(Long id) {
        return productRepository.findProductsByUserId(id);
    }

    @Override
    public List<Product> findByIsNew(boolean isNew) {
        return productRepository.findByIsNew(true);
    }

    @Override
    public List<Product> findByOnSale(boolean onSale) {
        return productRepository.findByOnSale(true);
    }

    @Override
    public List<Product> findByGenderMan() {
        return productRepository.findByProductGender(ProductGender.MAN);
    }

    @Override
    public List<Product> findByGenderWoman() {
        return productRepository.findByProductGender(ProductGender.WOMAN);
    }

    @Override
    public List<Product> findByGenderKid() {
        return productRepository.findByProductGender(ProductGender.KID);
    }

    @Override
    public List<Product> findByGenderUnisex() {
        return productRepository.findByProductGender(ProductGender.UNISEX);
    }
}
