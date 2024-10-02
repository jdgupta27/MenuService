package com.prj.menu.MenuService.Entity;

import lombok.Data;

@Data
public class Item {
    private Long itemId;
    private String name;
    private String description;
    private Double price;
    private String catagory;
    private Boolean available;
}
