package io.github.yashchenkon.socialpics.facebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.String.format;

/**
 * @author Mykola Yashchenko
 */
@Controller
@RequestMapping("/api/facebook")
public class FacebookPicsController {

    public static final String FACEBOOK_URL = "https://graph.facebook.com/%s/picture?width=%s&height=%s";

    @GetMapping(value = "/{profileId}")
    public String handle(@PathVariable("profileId") final String profileId,
                         @RequestParam(name = "width", required = false, defaultValue = "100") final String width,
                         @RequestParam(name = "height", required = false, defaultValue = "100") final String height) {
        return format("forward:" + FACEBOOK_URL, profileId, width, height);
    }
}