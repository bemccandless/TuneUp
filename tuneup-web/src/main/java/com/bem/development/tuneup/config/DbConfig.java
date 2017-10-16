package com.bem.development.tuneup.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by bemccandless on 10/6/17.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.bem.development.tuneup")
public class DbConfig {
}
