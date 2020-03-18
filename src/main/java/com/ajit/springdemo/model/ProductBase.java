package com.ajit.springdemo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

public class ProductBase {

    @Id
    private Long id;
    private String name;
    private String description;
    private Long price;
}
