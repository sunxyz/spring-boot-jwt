package com.sj.commons.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author yangrd
 * @date 2019/06/19
 */
@SpringBootApplication
public class CommonsLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonsLogApplication.class, args);
    }

}
