package com.example.repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.model.Product;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ProductRepositoryTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testFindAll() {
        // Save test data
        Product product1 = new Product(null, "Product 1", 10.0);
        Product product2 = new Product(null, "Product 2", 20.0);
        productRepository.save(product1);
        productRepository.save(product2);

        // Fetch all products
        Iterable<Product> products = productRepository.findAll();

        // Check assertions
        assertThat(products).isNotNull();
        assertThat(products).hasSize(2);
    }

    @Test
    public void testFindById() {
        // Save test data
        Product product = new Product(null, "Product 1", 10.0);
        product = productRepository.save(product);

        // Fetch product by ID
        Product retrievedProduct = productRepository.findById(product.getId()).orElse(null);

        // Check assertions
        assertThat(retrievedProduct).isNotNull();
        assertThat(retrievedProduct.getId()).isEqualTo(product.getId());
        assertThat(retrievedProduct.getName()).isEqualTo(product.getName());
        assertThat(retrievedProduct.getPrice()).isEqualTo(product.getPrice());
    }

    // Write similar tests for other repository methods
}

