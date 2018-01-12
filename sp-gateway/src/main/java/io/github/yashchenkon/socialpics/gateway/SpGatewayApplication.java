package io.github.yashchenkon.socialpics.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Mykola Yashchenko
 */
@EnableZuulProxy
@SpringBootApplication
public class SpGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpGatewayApplication.class, args);
    }
}
