package com.artemgggi.springauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringauthApplication.class, args);
    }
}
