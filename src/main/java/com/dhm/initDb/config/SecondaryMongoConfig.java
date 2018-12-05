package com.dhm.initDb.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.dhm.initDb.repositories.CRM",
        mongoTemplateRef = "secondaryMongoTemplate")
public class SecondaryMongoConfig {
}
