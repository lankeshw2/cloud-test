package com.ontogenerator.ontogenservice.rest;

import com.ontogenerator.ontogenservice.dto.*;
import com.ontogenerator.ontogenservice.model.Category;
import com.ontogenerator.ontogenservice.model.Product;
import com.ontogenerator.ontogenservice.repos.CategoryRepo;
import com.ontogenerator.ontogenservice.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/products")
public class ProductResource {

    @Autowired
    CategoryRepo categoryRepo;

    @Autowired
    ProductRepo productRepo;

    @Autowired
    private Transformer transformer;

    @PostMapping
    public void addProduct(@RequestBody CreateProduct createProduct) {
        Product product = transformer.toProudctEntity(createProduct);
        Category category = categoryRepo.findByName(createProduct.getCategory());
        if (category == null) {
            category = new Category();
            category.setName(createProduct.getCategory());
        }
        category.addProduct(product);
        categoryRepo.save(category);
    }

    @GetMapping
    @ResponseBody
    public CategoryProductResponse viewAllProducts() {
        List<Product> productList = productRepo.findAllProducts();
        List<ProductDto> productDtos = productList.stream().map(transformer::toProductDto).collect(Collectors.toList());
        Map<String, List<ProductDto>> categoryProducts = productDtos.stream().collect(Collectors.groupingBy(ProductDto::getCategory));
        List<CategoryProduct> list = new ArrayList<>();
        categoryProducts.forEach((category, list1) -> {

            list.add(new CategoryProduct(category, list1));
        });

        CategoryProductResponse response = new CategoryProductResponse();
        response.setProducts(list);
        return response;
    }

    @GetMapping(path = "/categories")
    @ResponseBody
    public List<CategoryDto> viewAllCategories() {
        List<Category> productList = categoryRepo.findAll();
        return productList.stream().map(transformer::toCategoryDto).collect(Collectors.toList());
    }
}
