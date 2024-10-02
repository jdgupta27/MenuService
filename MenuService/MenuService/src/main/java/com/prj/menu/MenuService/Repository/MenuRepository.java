package com.prj.menu.MenuService.Repository;

import com.prj.menu.MenuService.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Item, Long> {
}
