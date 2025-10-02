package com.company.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.annotation.processing.Generated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.io.Serializable;

@RedisHash("MenuUsers")
@AllArgsConstructor
@NoArgsConstructor
public class MenuUsers implements Serializable {

    public MenuUsers(Integer user_id, Integer menu_id) {
        this.user_id = user_id;
        this.menu_id = menu_id;
    }

    @Id
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private Integer user_id;

    @Getter
    @Setter
    private Integer menu_id;

    @Getter
    @Setter
    private int state = 1;

}
