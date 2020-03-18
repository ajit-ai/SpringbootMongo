package com.ajit.springdemo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collation = "products")
public class Product extends ProductBase implements Serializable {


}
