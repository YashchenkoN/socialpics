package io.github.yashchenkon.socialpics.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Mykola Yashchenko
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpDiscoveryApplication.class, args);
    }
}
