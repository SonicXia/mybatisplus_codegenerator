package com.atsonic.mybatisplus_codegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MybatisplusCodegeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusCodegeneratorApplication.class, args);
    }

}
