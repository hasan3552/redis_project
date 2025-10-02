package com.company.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column(nullable = false)
    @Getter
    @Setter
    private String username;


    @Column(nullable = false, name = "full_name")
    @Getter
    @Setter
    private String fullName;

    @Column(nullable = false)
    @Getter
    @Setter
    private String password;

    @Column(nullable = false, unique = true)
    @Getter
    @Setter
    private String email;

    @Column
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column
    private Boolean visible = Boolean.TRUE;
}
