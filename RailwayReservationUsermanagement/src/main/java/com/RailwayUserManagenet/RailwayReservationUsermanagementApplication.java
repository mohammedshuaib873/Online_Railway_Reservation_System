package com.RailwayUserManagenet;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2 
public class RailwayReservationUsermanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RailwayReservationUsermanagementApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	
	  @Bean 
	  public Docket swaggerConfiguration() { 
      return new Docket(DocumentationType.SWAGGER_2) 
    		  .select() 
    		  .paths(PathSelectors.any())
	           .apis(RequestHandlerSelectors.basePackage("com.RailwayUserManagement"))
	           .build() 
	           .apiInfo(apiDetails());
	  
	  }
	  
	  private ApiInfo apiDetails() 
	  { 
	   return new ApiInfo( "User API Documentation",
	  "API for User Microservice", "1.0", "Free to use", 
	  new springfox.documentation.service.Contact("Mohammed Shuaib A T","http://Youtube.com", "muhammedsuhaib873@gmail.com"), "API Licence",
	  "http://Youtube.com", Collections.emptyList()); 
	   }
	 
}
