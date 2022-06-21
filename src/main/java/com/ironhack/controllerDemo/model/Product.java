package com.ironhack.controllerDemo.model;

import com.ironhack.controllerDemo.enums.Category;
import com.ironhack.controllerDemo.enums.Department;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {
//    id BIGINT AUTO_INCREMENT NOT NULL,
//    name VARCHAR(255),
//    price DECIMAL(10,2),
//    category VARCHAR(30),
//    department VARCHAR(30),
//    PRIMARY KEY (id)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Department department;

    public Product() {
    }

    public Product(String name, BigDecimal price, Category category, Department department) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
