package com.maryanto.dimas.oauth2.example.oauth2example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
public class Oauth2ExampleApplication extends SpringBootServletInitializer {

//	public static void main(String[] args) {
//		SpringApplication.run(Oauth2ExampleApplication.class, args);
//	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Oauth2ExampleApplication.class);
    }
}
