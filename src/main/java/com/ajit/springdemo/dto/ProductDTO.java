package com.ajit.springdemo.dto;

import com.ajit.springdemo.model.ProductBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
//@NoArgsConstructor
public class ProductDTO extends ProductBase {
}
