package com.prj.menu.MenuService.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @GetMapping("/")
    public ResponseEntity<String> getAllHotels(){
        return ResponseEntity.ok("All menu available");
    }
}
