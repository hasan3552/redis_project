package com.company.service;

import com.company.dto.MenuDTO;
import com.company.entity.Menu;
import com.company.repository.redis.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public Iterable<Menu> getAllMenus(){

        return menuRepository.findAll();
    }

    public Menu save(MenuDTO menuDTO){

        Menu menu = new Menu(menuDTO.getName());
        menuRepository.save(menu);

        return menu;
    }

    public Optional<Menu> findById(Integer id){

        return menuRepository.findById(id);
    }


    @PostConstruct
    public void insertMenu(){
        Menu menu = new Menu("Dashboard");
        menuRepository.save(menu);
        Menu menu1 = new Menu("Cabinet");
        menuRepository.save(menu1);
        Menu menu2 = new Menu("Settings");
        menuRepository.save(menu2);
        Menu menu3 = new Menu("Exit");
        menuRepository.save(menu3);
    }
}
