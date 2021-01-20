package com.spencerchigananda.conversionservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.spencerchigananda.conversionservice.api"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());

    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Conversions REST API",
                "REST API to connect mobile and web clients to the measurement unit conversions platform.",
                "API Terms of Service",
                "Terms of service",
                new Contact("Spencer Chigananda", "www.spencerchigananda.com", "spencerchigananda@gmail.com"),
                "License of API", "API license URL", Collections.emptyList()
        );
    }

    /*@Bean
    UiConfiguration uiConfig(){
        return UiConfigurationBuilder.builder()
                .docExpansion(DocExpansion.LIST)
                .build();
    }*/
}
