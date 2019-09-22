package com.ontogenerator.ontogenservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    List<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {

        this.products = products;
    }

    public void addProduct(Product product) {

        if (this.getProducts() != null) {

            this.getProducts().add(product);
        } else {

            this.products = new ArrayList<>();
            products.add(product);
        }
        product.setCategory(this);
    }
}
