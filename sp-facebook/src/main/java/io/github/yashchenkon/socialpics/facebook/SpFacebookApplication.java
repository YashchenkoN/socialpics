package io.github.yashchenkon.socialpics.facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mykola Yashchenko
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpFacebookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpFacebookApplication.class, args);
    }
}
