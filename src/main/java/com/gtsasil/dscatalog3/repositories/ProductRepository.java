package com.gtsasil.dscatalog3.repositories;

import com.gtsasil.dscatalog3.entities.Category;
import com.gtsasil.dscatalog3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
