package com.shop.shopping.request;

import com.shop.shopping.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {

    private Long id;

    private String name;

    private String brand;

    private BigDecimal price;

    private int inventory;

    private String description;

    private Category category;
}