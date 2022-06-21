package com.ironhack.controllerDemo.impl;

import com.ironhack.controllerDemo.enums.Category;
import com.ironhack.controllerDemo.enums.Department;
import com.ironhack.controllerDemo.interfaces.ProductController;
import com.ironhack.controllerDemo.model.Course;
import com.ironhack.controllerDemo.model.Product;
import com.ironhack.controllerDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductControllerImpl implements ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product findById(@PathVariable Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.get();
    }

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findByCategoryAndDepartment(@RequestParam Optional<Category> category,
                                                     @RequestParam(defaultValue = "CLOTHING")
                                                     Department department) {
        List<Product> productList = new ArrayList<>();
        if (category.isPresent()) {
            productList = productRepository.findByCategoryAndDepartment(category, department);
        }else{
            productList = productRepository.findByDepartment(department);
        }
        return productList;
    }
}
