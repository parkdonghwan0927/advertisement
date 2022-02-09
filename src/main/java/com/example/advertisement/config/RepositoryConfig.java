package com.example.advertisement.config;

import com.example.advertisement.repository.MenuRepository;
import com.example.advertisement.repository.StoreRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public MenuRepository menuRepository() {
        return new MenuRepository() {
        };
    }

    @Bean
    public StoreRepository StoreRepository() {
        return new StoreRepository() {};
    }


}
