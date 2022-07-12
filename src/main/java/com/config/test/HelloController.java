package com.config.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private FeedsConfig feedsConfig;

    @Autowired
    private Environment environment;

    @RequestMapping("/hello")
    private String hello() {
        return "Hi " + feedsConfig.abc + ", " + feedsConfig.urls;
    }
}
