package com.ibm.handsup.entity.dji;

import lombok.Data;

@Data
public class Type {
    private String id;
    private String name;
    private String type;
    private String image;

    public Type(String id, String name, String type, String image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.image = image;
    }
}
