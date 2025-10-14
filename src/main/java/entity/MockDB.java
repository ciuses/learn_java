package entity;

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
    public List<entity.Gem> gemContainer() {
        return new ArrayList<>();
    }
}
