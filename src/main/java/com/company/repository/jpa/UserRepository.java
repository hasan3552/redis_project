package com.company.repository.jpa;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableRedisRepositories(basePackages = "com.company.repository.jpa")
public interface UserRepository extends JpaRepository<User, Integer> {
    // qo'shimcha metodlar yozishingiz mumkin
}
