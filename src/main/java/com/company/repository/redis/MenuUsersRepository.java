package com.company.repository.redis;

import com.company.entity.MenuUsers;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories(basePackages = "com.company.repository.redis")
public interface MenuUsersRepository extends CrudRepository<MenuUsers, Integer> {
}
