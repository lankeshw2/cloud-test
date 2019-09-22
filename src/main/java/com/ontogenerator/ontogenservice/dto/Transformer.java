package com.ontogenerator.ontogenservice.dto;

import com.ontogenerator.ontogenservice.model.Category;
import com.ontogenerator.ontogenservice.model.Product;
import org.springframework.stereotype.Component;

@Component
public class Transformer {

    public Product toProudctEntity(CreateProduct productDto) {

        Product product = new Product();
        product.setProductName(productDto.getName());
        product.setPrice(productDto.getPrice());

        return product;
    }

    public Category toCategoryEntity(CategoryDto category) {

        Category categoryEntity = new Category();

        categoryEntity.setName(category.getName());
        return categoryEntity;
    }

    public CategoryDto toCategoryDto(Category category) {

        CategoryDto categoryEntity = new CategoryDto();

        categoryEntity.setName(category.getName());
        return categoryEntity;
    }

    public ProductDto toProductDto(Product product) {

        ProductDto dto = new ProductDto();
        dto.setName(product.getProductName());
        dto.setCategory(product.getCategory().getName());

        dto.setPrice(product.getPrice());

        return dto;
    }
}
