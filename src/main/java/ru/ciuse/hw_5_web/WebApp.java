package ru.ciuse.hw_5_web;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"hw_5_web", "hw_4_orm"})
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("@project.version@") String appVersion) {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("My App API")
                        .version(appVersion)
                        .license(new License()
                                .name("My home work")
                                .url("https://myurl.com")));
    }
}

//https://javarush.com/groups/posts/2488-obzor-rest-chastjh-3-sozdanie-restful-servisa-na-spring-boot