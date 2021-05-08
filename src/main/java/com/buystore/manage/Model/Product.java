package com.buystore.manage.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int productId;

    @Getter
    @Setter
    private String pdctName;
    @Getter
    @Setter
    private String category;

    @Getter
    @Setter
    private String manufacturer;

    @Getter
    @Setter
    private String stock;
    @Getter
    @Setter
    private String expirydate;

}
