package com.cicd.cicdappliedtospringbootjavaapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cicd.cicdappliedtospringbootjavaapp.controller.HelloController;

@SpringBootTest
public class CicdAppliedToSpringBootJavaAppApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    public void contextLoads() {
        assertEquals("Hello World from Prodevans", helloController.home());
    }
}
