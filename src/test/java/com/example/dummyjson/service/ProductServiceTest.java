package com.example.dummyjson.service;

import com.example.dummyjson.dto.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        List<Product> result = productService.getAllProducts();
        assertNotNull(result);
        assertTrue(result.size() > 3);
    }

    @Test
    public void testGetProductById() {
        Product result = productService.getProductById(1L);

        assertNotNull(result);
        assertEquals("Essence Mascara Lash Princess", result.getTitle());
    }
}
