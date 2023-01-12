package org.lupo.repository;

import org.lupo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findLabelsByUserId(Long id);
    Product findOneById(Long id);
}
