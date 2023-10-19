package com.amdocs.buyyourphonebackend.controller;

import com.amdocs.buyyourphonebackend.Entity.Product;
import com.amdocs.buyyourphonebackend.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        // Check if a product with the same attributes exists in the warehouse
        Product existingProduct = productRepository.findByBrandAndModelAndColorAndSizeAndTypeAndPriceAndWarehouse(
                product.getBrand(),
                product.getModel(),
                product.getColor(),
                product.getSize(),
                product.getType(),
                product.getPrice(),
                product.getWarehouse()
        );

        if (existingProduct != null) {
            // If the product exists, update the quantity
            existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
            return productRepository.save(existingProduct);
        } else {
            // If the product doesn't exist, create a new entry
            return productRepository.save(product);
        }
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}