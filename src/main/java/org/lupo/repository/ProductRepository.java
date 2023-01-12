package org.lupo.repository;

import org.lupo.enumerations.ProductGender;
import org.lupo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductsByUserId(Long id);
    Product findOneById(Long id);
    List<Product> findByIsNew(boolean isNew);
    List<Product> findByOnSale(boolean onSale);
    List<Product> findByProductGender(ProductGender productGender);

}
