package com.example.demoapp;

import com.example.demoapp.DemoAppApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(classes = DemoAppApplication.class)
@AutoConfigureMockMvc

public class HelloControllerTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private DemoAppApplication repository;

    @Test
    public void givenHelloWorld_thenStatus200()
            throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/helloWorld")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andExpect(MockMvcResultMatchers.content().string("Hello World"));
    }}