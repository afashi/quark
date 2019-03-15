package com.afas.authtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhou
 */
@RestController
@SpringBootApplication
public class AuthTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthTestApplication.class, args);
    }

    @GetMapping("/test")
    public String testAuthentication() {
        return "authentication permit";
    }

}
