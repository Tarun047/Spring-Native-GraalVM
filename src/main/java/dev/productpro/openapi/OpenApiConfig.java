package dev.productpro.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApiInformation() {
        Server localServer = new Server().url("http://localhost:8080").description("Products API Application");
        Contact contact = new Contact().email("gtarun047@gmail.com").name("Gudipati Tarun");
        Info info = new Info().contact(contact).description("The Products Open API")
                .summary("The Products Open API").title("Products API")
                .version("V1.0.0").license(new License().name("Apache 2.0").url("http://springdoc.org"));

        return new OpenAPI().info(info).addServersItem(localServer);
    }

}