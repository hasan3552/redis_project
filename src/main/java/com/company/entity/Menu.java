package com.company.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.io.Serializable;

@RedisHash("Menu")
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable {

    public Menu(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int state = 1;

}
