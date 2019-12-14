package com.spring.boot.learning.lombok.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Parking-api").apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.spring.boot.learning.lombok.controller")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Parking Lot API").description("Parking Lot API reference for developers")
				.termsOfServiceUrl("http://JustDummywebsite.com")
				.contact(new Contact("Parking Lot", "http://JustDummywebsite.com", "parkinglot@gmail.com"))
				.license("Parking Lot License").licenseUrl("parkinglot@gmail.com").version("1.0").build();
	}
	
	@Bean
	public Docket helloApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("helloWorld-api").apiInfo(helloApiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.spring.boot.learning.lombok.hellocontroller")).build();
	}

	private ApiInfo helloApiInfo() {
		return new ApiInfoBuilder().title("Hello World API").description("Hello World API reference for developers")
				.termsOfServiceUrl("http://JustDummywebsite.com")
				.contact(new Contact("Hello World", "http://JustDummywebsite.com", "helloworld@gmail.com"))
				.license("Hello World License").licenseUrl("helloworld@gmail.com").version("1.0").build();
	}

}
