package com.prj.menu.MenuService.Controller;

import com.prj.menu.MenuService.Entity.Item;
import com.prj.menu.MenuService.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired MenuService menuService;

    @PostMapping
    public ResponseEntity<Item> createHotel(@RequestBody Item item){
        Item item1 = menuService.addItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }

    @GetMapping("/")
    public ResponseEntity<List<Item>> getAllItems(){
        List<Item> allItems = menuService.getAllItems();
        return ResponseEntity.ok(allItems);
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<Item> getHotel(@PathVariable Long itemId){
        Item item = menuService.getItem(itemId);
        return ResponseEntity.ok(item);
    }

}
