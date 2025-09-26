package com.Faiz.Ecom_Proj.controller;

import com.Faiz.Ecom_Proj.model.Product;
import com.Faiz.Ecom_Proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
}
