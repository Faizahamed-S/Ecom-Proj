package com.Faiz.Ecom_Proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Faiz.Ecom_Proj.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
