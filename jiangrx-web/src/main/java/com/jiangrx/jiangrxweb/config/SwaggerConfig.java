package com.jiangrx.jiangrxweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 0:42 2020/6/8
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("CaoPeng")
                .select().apis(RequestHandlerSelectors.basePackage("com.jiangrx.jiangrxweb.controller"))
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("CaoPeng","","caopengokk@163.com");
        return new ApiInfo("CaoPeng的API Documentation", "Api Documentation", "1.0", "urn:tos",
                contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
    }
}
