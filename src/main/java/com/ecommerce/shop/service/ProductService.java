package com.ecommerce.shop.service;

import com.ecommerce.shop.data.dto.ProductDto;
import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.web.exceptions.ProductDoesNotExistException;

import java.util.List;

public interface ProductService {

    Product save(Product product);
    List<Product> findAll();
    Product findById(Long id);
    Product update(Long id, ProductDto productDto) throws ProductDoesNotExistException;
    void deleteById(Long id);
}
