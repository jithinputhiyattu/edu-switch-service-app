package com.edu.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any()).build().apiInfo(getApiInfo());
    }


    private ApiInfo getApiInfo() {

        Contact contact = new Contact("Jithin Kumar Puthiyattu",
                "https://www.linkedin.com/in/jithinputhiyattu/", "jithinputhiyattu@gmail.com");
        ApiInfo apiInfo = new ApiInfo("Testing Swagger - Jithin Puthiyattu",
                "Swagger Tools Test Application", "V1.0.0", "https://github.com/jithinputhiyattu", contact,
                "Coding your dreams...", "https://www.jithinputhiyattu.com/", new ArrayList<>());

        return apiInfo;

    }


    }
