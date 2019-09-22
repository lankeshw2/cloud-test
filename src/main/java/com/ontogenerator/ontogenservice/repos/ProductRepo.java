package com.ontogenerator.ontogenservice.repos;

import com.ontogenerator.ontogenservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    @Query(value = "select p from Product p  join fetch p.category")
    List<Product> findAllProducts();
}
