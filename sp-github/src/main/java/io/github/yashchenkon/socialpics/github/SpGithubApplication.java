package io.github.yashchenkon.socialpics.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mykola Yashchenko
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpGithubApplication.class, args);
    }
}
