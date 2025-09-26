package com.Faiz.Ecom_Proj.service;

import com.Faiz.Ecom_Proj.model.Product;
import com.Faiz.Ecom_Proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getProducts() {
      return repository.findAll();
    }

}
