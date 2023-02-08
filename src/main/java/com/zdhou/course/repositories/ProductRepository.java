package com.zdhou.course.repositories;

import com.zdhou.course.entities.Category;
import com.zdhou.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
