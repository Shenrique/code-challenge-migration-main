package com.example.dummyjson.controller;

import com.example.dummyjson.dto.Product;
import com.example.dummyjson.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable @Valid Long id) {
        Product product = productService.getProductById(id);
        if(product == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não encontrado");
        }
        return ResponseEntity.ok(product);
    }

}
