package dev.productpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(DatabaseRuntimeHintsRegistrar.class)
public class ProductProApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductProApplication.class, args);
    }

}
