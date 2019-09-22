package com.ontogenerator.ontogenservice.dto;

import java.util.List;

public class CategoryProduct {

    String category;

    ProductDto[] list;

    public CategoryProduct(String category, List<ProductDto> productDtos) {
        this.category = category;
        this.list = productDtos.toArray(new ProductDto[productDtos.size()]);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProductDto[] getList() {
        return list;
    }

    public void setList(ProductDto[] products) {
        this.list = products;
    }
}