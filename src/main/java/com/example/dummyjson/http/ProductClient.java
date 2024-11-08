package com.example.dummyjson.http;


import com.example.dummyjson.dto.Product;
import com.example.dummyjson.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productClient", url = "https://dummyjson.com")
public interface ProductClient {

    @GetMapping("/products")
    ProductResponse getAllProducts();

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable Long id);
}
