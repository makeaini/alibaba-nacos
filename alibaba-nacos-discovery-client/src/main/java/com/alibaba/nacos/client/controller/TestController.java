package com.alibaba.nacos.client.controller;

import com.alibaba.nacos.client.fegin.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private Client client;

    @GetMapping("/hello")
    public String test() {
        return client.hello("shining");
    }

}
