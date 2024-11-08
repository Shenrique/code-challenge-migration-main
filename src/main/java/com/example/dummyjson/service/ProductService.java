package com.example.dummyjson.service;

import com.example.dummyjson.http.ProductClient;
import com.example.dummyjson.dto.Product;
import com.example.dummyjson.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductClient productClient;

    public List<Product> getAllProducts() {
        ProductResponse productResponse = productClient.getAllProducts();
        return productResponse.getProducts();
    }

    public Product getProductById(Long id) {
        return productClient.getProductById(id);
    }
}
