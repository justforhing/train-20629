package io.choerodon.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableFeignClients
//@EnableEurekaClient
//@EnableChoerodonResourceServer
public class DemoServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoServiceApplication.class, args);
    }

    @Value("${greeting.content}")
    private  String content;
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>(content, HttpStatus.OK);
    }
}

