package com.example.deploymentci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloController {
    @GetMapping("/")
    public String hello(){
        return "Hello World its my first deployment with Spring Boot 2.0 CI /CD!.....";
    }
}


