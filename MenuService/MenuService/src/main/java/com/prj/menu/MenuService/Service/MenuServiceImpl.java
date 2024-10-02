package com.prj.menu.MenuService.Service;

import com.prj.menu.MenuService.Entity.Item;
import com.prj.menu.MenuService.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired MenuRepository menuRepository;

    @Override
    public Item addItem(Item item) {
        return menuRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return menuRepository.findAll();
    }

    @Override
    public Item getItem(Long itemId) {
        return menuRepository.findById(itemId).get();
    }
}
