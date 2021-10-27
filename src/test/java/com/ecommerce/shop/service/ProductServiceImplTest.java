package com.ecommerce.shop.service;

import com.ecommerce.shop.data.dto.ProductDto;
import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.data.repository.ProductRepository;
import com.ecommerce.shop.web.exceptions.ProductDoesNotExistException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Sql(scripts = {"/db/insert.sql"})
class ProductServiceImplTest {

    @Autowired
    ProductService productServiceImpl;

    @Autowired
    ProductRepository productRepository;

    @Test
    void updateProductTest() throws ProductDoesNotExistException {
        Product product = (productRepository.findById(2L).orElse(null));
        assertThat(product).isNotNull();
        assertThat(product.getName()).isEqualTo("Luxury desk");

        ProductDto productDto = new ProductDto();
        productDto.setName("Plain desk");
        //call the service update method
        product = productServiceImpl.update(2L, productDto);
        assertThat(product.getName()).isEqualTo(productDto.getName());
    }
}