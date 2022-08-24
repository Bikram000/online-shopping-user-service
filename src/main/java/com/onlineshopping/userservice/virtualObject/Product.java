package com.onlineshopping.userservice.virtualObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long productId;
    private String name;
    private String description;
    private double price;
}
