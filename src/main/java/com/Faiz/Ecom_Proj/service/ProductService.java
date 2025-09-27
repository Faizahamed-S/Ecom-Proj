package com.Faiz.Ecom_Proj.service;

import com.Faiz.Ecom_Proj.model.Product;
import com.Faiz.Ecom_Proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile file) throws IOException {
        product.setImageName(file.getOriginalFilename());
        product.setImageType(file.getContentType());
        product.setImageData(file.getBytes());
        return repository.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile file) throws IOException {
        product.setImageName(file.getOriginalFilename());
        product.setImageType(file.getContentType());
        product.setImageData(file.getBytes());
        return repository.save(product);
    }

    public void deleteProduct(int id) {
        repository.deleteById(id);
    }
}
