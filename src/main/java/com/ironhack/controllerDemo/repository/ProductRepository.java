package com.ironhack.controllerDemo.repository;

import com.ironhack.controllerDemo.enums.Category;
import com.ironhack.controllerDemo.enums.Department;
import com.ironhack.controllerDemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryAndDepartment(Optional<Category> category, Department department);
    List<Product> findByDepartment(Department department);
}
