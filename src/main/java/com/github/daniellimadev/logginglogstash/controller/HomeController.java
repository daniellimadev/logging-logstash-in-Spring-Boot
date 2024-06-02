package com.github.daniellimadev.logginglogstash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.logging.Logger;

import static net.logstash.logback.argument.StructuredArguments.kv;
import static net.logstash.logback.argument.StructuredArguments.v;


@RestController
public class HomeController {

    private static Logger log = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/")
    public Map<String, String> get() {

        log.info("Request with kv" + kv("path", "/"));
        log.info("Request with kv {}" + kv("path", "/"));
        log.info("Request with v" + v("path", "/"));
        log.info("Request with v {}" + v("path", "/"));

        return Map.of("hello", "world");
    }
}
