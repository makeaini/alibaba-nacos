package com.alibaba.nacos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AlibabaNacosDiscoveryConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryConfigApplication.class, args);
    }

    @RestController
    @RefreshScope
    public class ConfigController {

        @Value("${didispace.title}")
        private String title;

        @RequestMapping("/get")
        public String get() {
            return title;
        }
    }

}

