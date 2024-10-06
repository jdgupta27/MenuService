package com.prj.menu.MenuService.Controller;

import com.prj.menu.MenuService.Entity.Item;
import com.prj.menu.MenuService.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired MenuService menuService;

    @MutationMapping
    public ResponseEntity<Item> addItem(@Argument String name, @Argument String description, @Argument Double price, @Argument String catagory, @Argument Boolean available){
        Item item = new Item();
        item.setName(name);
        item.setDescription(description);
        item.setPrice(price);
        item.setCatagory(catagory);
        item.setAvailable(available);
        menuService.addItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }

    @QueryMapping(name = "getItems")
    public ResponseEntity<List<Item>> getAllItems(){
        List<Item> allItems = menuService.getAllItems();
        return ResponseEntity.ok(allItems);
    }

    @QueryMapping()
    public ResponseEntity<Item> getItem(@Argument Long itemId){
        Item item = menuService.getItem(itemId);
        return ResponseEntity.ok(item);
    }

    @MutationMapping("/")
    public ResponseEntity<Item> updateItem(@Argument Long itemId, @Argument Double price, @Argument Boolean available){
        Item item = new Item();
        item.setItemId(itemId);
        item.setPrice(price);
        item.setAvailable(available);
        menuService.updateItem(item);
        return ResponseEntity.ok(item);
    }

    @MutationMapping()
    public ResponseEntity<HttpStatus> deleteItem(@Argument Long itemId){
        menuService.deleteItem(itemId);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
