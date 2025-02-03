package com.study;

import com.study.domain.users.entity.Users;
import com.study.domain.users.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by minkyukim
 * Created on 2025. 1. 21.
 **/

@Service
@RequiredArgsConstructor
public class ApiService {
    private final UsersRepository usersRepository;


    public void test() {
        Users users = usersRepository.findById(1L).orElse(null);
        System.out.println(users);
    }

}
