package com.study.domain.users.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by minkyukim
 * Created on 2025. 1. 21.
 **/

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Users {

    @Id
    @SequenceGenerator(
            name="users_id_seq_gen",
            sequenceName="users_id_seq",
            allocationSize=50
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id_seq_gen")
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Builder
    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
