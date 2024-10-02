package com.prj.menu.MenuService.Service;

import com.prj.menu.MenuService.Entity.Item;

import java.util.List;

public interface MenuService {
    Item addItem(Item item);
    List<Item> getAllItems();
    Item getItem(Long itemId);
}
