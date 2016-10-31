package com.huifu.module.web.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class ApplicationSwaggerConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Module系统API")
				.description("可复用组件在线服务的Rest API接口及测试平台 ")
				.license("Huifu Private")
				.licenseUrl("http://www.chinapnr.com/about.html")
				.termsOfServiceUrl("http://www.chinapnr.com/user_agreement.html")
				.version("1.0.0-SNAPSHOT")
				.contact(new Contact("richard", "http://www.chinapnr.com", "yeliang.kuang@chinapnr.com"))
				.build();
	}

	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.build()
				.directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
				.directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
				.apiInfo(apiInfo());
	}

}
