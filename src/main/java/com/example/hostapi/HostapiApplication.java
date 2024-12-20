package com.example.hostapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HostapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HostapiApplication.class, args);
    }

    @RequestMapping("/")
    public String home(){
        return "home";
    }

}
