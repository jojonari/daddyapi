package com.rest.api.comtroller.v1;

import com.rest.api.entity.User;
import com.rest.api.repo.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1")
public class UserController {
    private final UserJpaRepo userJpaRepo;

    @GetMapping("/user")
    public List<User> findAllUser(){
        return userJpaRepo.findAll();
    }

    @PostMapping("/user")
    public User save(){
        User user = User.builder()
                .uid("xkgun@naver.com")
                .name("재현")
                .build();
        return userJpaRepo.save(user);

    }
}
