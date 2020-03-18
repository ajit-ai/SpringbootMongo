package com.ajit.springdemo.service;

import com.ajit.springdemo.dto.ProductDTO;
import com.ajit.springdemo.model.Product;
import com.ajit.springdemo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    ModelMapper modelMapper = new ModelMapper();

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = productRepository.save(modelMapper.map(productDTO,Product.class)
        );
        return modelMapper.map(product,ProductDTO.class);
    }
}
