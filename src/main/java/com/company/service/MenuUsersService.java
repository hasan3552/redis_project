package com.company.service;

import com.company.entity.MenuUsers;
import com.company.repository.redis.MenuUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuUsersService {

    @Autowired
    private MenuUsersRepository menuUsersRepository;

    public void save(MenuUsers menuUsers){
        menuUsersRepository.save(menuUsers);
    }
}
