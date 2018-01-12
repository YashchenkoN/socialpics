package io.github.yashchenkon.socialpics.facebook.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Mykola Yashchenko
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FacebookPicsControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void shouldReturnPictureDefaultSize() throws Exception {
        mockMvc.perform(get("/api/facebook/userId"))
                .andExpect(status().isOk())
                .andExpect(forwardedUrl(String.format(FacebookPicsController.FACEBOOK_URL, "userId", "100", "100")));
    }

    @Test
    public void shouldReturnPictureCustomSize() throws Exception {
        mockMvc.perform(get("/api/facebook/userId?width=200&height=200"))
                .andExpect(status().isOk())
                .andExpect(forwardedUrl(String.format(FacebookPicsController.FACEBOOK_URL, "userId", "200", "200")));
    }
}