package org.bran.branproxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.bran.branproxy.dao")
public class BranproxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BranproxyApplication.class, args);
    }
}
