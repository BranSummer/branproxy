package org.bran.branproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class BranproxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BranproxyApplication.class, args);
    }
}
