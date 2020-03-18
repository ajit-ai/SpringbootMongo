package com.ajit.springdemo.controller;

import com.ajit.springdemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/api"})
@RequiredArgsConstructor
public class ProductController {


    @Autowired
    private final ProductService productService;

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String get() {
        return "Please gives url as Spring-Boot-Rest/user/get";
    }
}
