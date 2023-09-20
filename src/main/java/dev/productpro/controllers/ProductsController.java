package dev.productpro.controllers;

import dev.productpro.dtos.CreateProductRequest;
import dev.productpro.models.Product;
import dev.productpro.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private final ProductRepository productRepository;

    public ProductsController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    @PostMapping
    public Product createProduct(@RequestBody CreateProductRequest productRequest) {
        return productRepository.save(
                Product.builder()
                        .id(UUID.randomUUID())
                        .name(productRequest.getName())
                        .description(productRequest.getDescription())
                        .build());
    }
}
