package com.example.demo.swag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
@EnableSwagger2
@Configuration
public class SwaggerConfig {
	@Bean
	public Docket productApi()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.swag"))
				.paths(regex("/rest.*"))
				.build()
				.apiInfo(metaInfo());
	}
	@SuppressWarnings("deprecation")
	private ApiInfo metaInfo()
	{
//		ApiInfo apiI=new ApiInfo()
		ApiInfo apiInfo= new ApiInfo(
				"Spring boot Swagger Example API",
				"Spring boot Swagger example API for itc",
				"1.0",
				"Terms of Service",
				"Apache License Version 2.0",
				"https://www.apache.org/license.html",
				"abc");
				return apiInfo;
	}

}
