package com.library.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

    @Bean // it is used to indicate that a method produces a bean to be managed by the Spring container. 
    // It is used to define beans in the Spring context, which can be injected into other components using @Autowired annotation.
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
