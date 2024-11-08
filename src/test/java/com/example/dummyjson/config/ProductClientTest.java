package com.example.dummyjson.config;

import com.example.dummyjson.dto.Product;
import com.example.dummyjson.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@EnableFeignClients
@SpringBootTest
public class ProductClientTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testeIntegracaoProdutoService(){
        var productResponse = productService.getAllProducts();

        assertNotNull(productResponse);
        assertEquals(productResponse.get(0).getId(), 1L);
    }

}
