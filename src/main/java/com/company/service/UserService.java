package com.company.service;

import com.company.dto.SaveUser;
import com.company.entity.MenuUsers;
import com.company.entity.User;
import com.company.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    MessageService messageService;

    @Autowired
    MenuUsersService menuUsersService ;

    public User saveUser(SaveUser add_user) {
        User user = new User();
        user.setFullName(add_user.getName());
        user.setUsername(add_user.getUsername());
        user.setPassword(add_user.getPassword());
        user.setEmail(add_user.getEmail());

        messageService.sendMessage(user.toString());
        userRepository.save(user);

        List<Integer> menus = add_user.getMenuIds();

        menus.forEach(menu -> {
            MenuUsers menuUsers  = new MenuUsers(user.getId(), menu);
            menuUsersService.save(menuUsers);
        });


        return user;
    }

    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }
}

