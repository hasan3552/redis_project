package com.company.repository.redis;

import com.company.entity.Menu;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories(basePackages = "com.company.repository.redis")
public interface MenuRepository extends CrudRepository<Menu, Integer> {
}
