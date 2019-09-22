package com.ontogenerator.ontogenservice.repos;

import com.ontogenerator.ontogenservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
