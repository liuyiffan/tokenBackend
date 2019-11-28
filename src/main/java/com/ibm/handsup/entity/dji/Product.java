package com.ibm.handsup.entity.dji;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String type;
    private String image;

    public Product(String id, String name, String type, String image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.image = image;
    }
}
