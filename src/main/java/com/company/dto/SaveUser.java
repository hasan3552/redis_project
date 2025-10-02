package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class SaveUser {

    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private Date birthDate;


    @Getter
    @Setter
    private List<Integer> menuIds;
}
