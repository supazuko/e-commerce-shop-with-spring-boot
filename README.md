# e-commerce-shop-with-spring-boot

shop is an e-commerce project built with the spring framework, Java, SQL and maven as a build tool

#Features
RestAPI that includes the following:
Add products to database.
Find products by id.
Find all products.
Delete product.

Spring MVC with thymeleaf template engine for viewing product details

#Installation
Step 1: clone repository

Step 2: install dependencies - cd into folder the root folder and run the following commands:
`mvn install`

Step 3: Setup database - run sql script in the db folder
`src/main/resources/db/setup-db.sql`

Step 4: Run the project
`mvn spring-boot-run`