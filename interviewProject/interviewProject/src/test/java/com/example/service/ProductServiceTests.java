package com.example.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.Product;
import com.example.repository.ProductRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ProductServiceTests {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetProductById() {
        // Mocking repository response
        Product product = new Product(1L, "Product 1", 10.0);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        // Call service method
        Optional<Product> result = productService.getProductById(1L);

        // Verify the result
        assertTrue(result.isPresent());
        assertEquals("Product 1", result.get().getName());
    }

    @Test
    public void testUpdateProduct() {
        // Mocking repository response
        Product product = new Product(1L, "Product 1", 10.0);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        when(productRepository.save(any(Product.class))).thenReturn(product);

        // Call service method
        Product updatedProduct = new Product(1L, "Updated Product 1", 15.0);
        productService.updateProduct(updatedProduct);

        // Verify that the product is updated
        assertEquals("Updated Product 1", product.getName());
        assertEquals(15.0, product.getPrice());
    }

    // Write similar tests for other service methods
}
