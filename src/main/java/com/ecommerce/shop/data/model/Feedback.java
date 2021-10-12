package com.ecommerce.shop.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Feedback {
    @Id
    private Long id;
    private String comment;
    private String rating;
}
