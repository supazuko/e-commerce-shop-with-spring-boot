package com.ecommerce.shop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Slf4j
class ShopApplicationTests {

	@Autowired
	DataSource dataSource;

	@Value("${test-name}")
	private String name;
	@Value("${test-year}")
	private String currentYear;

	@Test
	public void printValues(){
		log.info("Test name -> {}", name);
		assertThat(name).isEqualTo("Jack");
		log.info("Test year -> {}", currentYear);
		assertThat(currentYear).isEqualTo("2020");
	}

	@Test
	public void connectToDatabaseTest(){
		assertThat(dataSource).isNotNull();
		log.info("Datasource properties -> {}", dataSource);
//		String url = "jdbc:mysql//:localhost:3306/shopdb";
//		String username = "shop_user";
//		String password = "shop123";

		try{
			Connection connection = dataSource.getConnection();
			assertThat(connection).isNotNull();
			log.info("Database -> {}", connection.getCatalog());
		}catch (SQLException exception){
			log.info("An exception occurred -> {}", exception.getMessage());
		}
	}

}
