package io.github.yashchenkon.socialpics.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static java.lang.String.format;

/**
 * @author Mykola Yashchenko
 */
@Controller
@RequestMapping("/api/facebook")
public class GithubController {

    public static final String GITHUB_URL = "https://github.com/%s.png";

    @GetMapping(value = "/{profileId}")
    public String handle(@PathVariable("profileId") final String profileId) {
        return format("forward:" + GITHUB_URL, profileId);
    }
}
