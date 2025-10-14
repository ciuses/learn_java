package ru.ciuse.hw_2_java_db.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MockDB {

    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public List<Gem> gemContainer() {
        return new ArrayList<>();
    }
}
