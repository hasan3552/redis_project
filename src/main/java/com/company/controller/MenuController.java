package com.company.controller;


import com.company.dto.MenuDTO;
import com.company.entity.Menu;
import com.company.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Optional;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;


    @PostMapping
    public Menu saveMenu(@RequestBody MenuDTO menuDTO) {
        return menuService.save(menuDTO);
    }

    @GetMapping("/{id}")
    public Optional<Menu> getMenu(@PathVariable Integer id) {
        return menuService.findById(id);
    }



}
